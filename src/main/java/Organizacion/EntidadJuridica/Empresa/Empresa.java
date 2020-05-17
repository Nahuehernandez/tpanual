package Organizacion.EntidadJuridica.Empresa;

import Organizacion.EntidadJuridica.Empresa.TipoEmpresa.TipoEmpresa;
import Organizacion.EntidadJuridica.EntidadJuridica;


public class Empresa extends EntidadJuridica {
    private int cantEmpleados;
    private char actividadId;
    private TipoEmpresa tipoEmpresa;

    public Empresa(int cantEmpleados, char actividadId, TipoEmpresa tipoEmpresa) {
        this.cantEmpleados = cantEmpleados;
        this.actividadId = actividadId;
        this.tipoEmpresa = tipoEmpresa;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public char getActividadId() {
        return actividadId;
    }

    public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public int totalVentas() {
        return 0;
    }

    public int ventaAnualPromedio(){
        return 0;
    }

    public void recategorizar() throws Exception {
        tipoEmpresa.recategorizar(this);
    }


    public boolean cumpleCondicionMicro(){
        //{ventasTotalesMinimas, ventasTotalesMaximas, cantEmpleadosMinima, cantEmpleadosMaxima}
        int[] agropecuario = {0, 12890000, 0, 5};
        int[] industriaYMineria = {0, 26540000, 0, 15};
        int[] servicios = {0, 8500000, 0, 7};
        int[] construccion = {0, 15230000, 0, 12};
        int[] comercio = {0, 29740000, 0, 7};

        return this.condicionSector(agropecuario,industriaYMineria,servicios,construccion,comercio);
    }

    public boolean cumpleCondicionPequena() {
        //{ventasTotalesMinimas, ventasTotalesMaximas, cantEmpleadosMinima, cantEmpleadosMaxima}
        int[] agropecuario = {12890000, 48480000, 5, 10};
        int[] industriaYMineria = {26540000, 190410000, 15, 60};
        int[] servicios = {8500000, 50950000, 7, 30};
        int[] construccion = {15230000, 90310000, 12, 45};
        int[] comercio = {29740000, 178860000, 7, 35};

        return this.condicionSector(agropecuario,industriaYMineria,servicios,construccion,comercio);
    }

    public boolean cumpleCondicionMedidanaTramoUno(){
        //{ventasTotalesMinimas, ventasTotalesMaximas, cantEmpleadosMinima, cantEmpleadosMaxima}
        int[] agropecuario = {48480000, 345430000, 10, 50};
        int[] industriaYMineria = {190410000, 1190330000, 60, 235};
        int[] servicios = {50950000, 425170000, 30, 165};
        int[] construccion = {90310000, 503880000, 45, 200};
        int[] comercio = {178860000, 1502750000, 35, 125};

        return this.condicionSector(agropecuario,industriaYMineria,servicios,construccion,comercio);
    }

    public boolean cumpleCondicionMedianaTramoDos(){
        //{ventasTotalesMinimas, ventasTotalesMaximas, cantEmpleadosMinima, cantEmpleadosMaxima}
        int[] agropecuario = {345430000, 547890000, 50, 215};
        int[] industriaYMineria = {1190330000, 1739590000, 235, 655};
        int[] servicios = {425170000, 607210000, 165, 535};
        int[] construccion = {503880000, 755740000, 200, 590};
        int[] comercio = {1502750000, 2146810000, 125, 345};

        return this.condicionSector(agropecuario,industriaYMineria,servicios,construccion,comercio);
    }


    public boolean condicionSector(int[] agropecuario,int[] industriaYMineria,int[] servicios,
                                   int[]construccion,int[]comercio){
        return this.subCondicion(agropecuario,'A') || this.verificaIndustriaYMineria(industriaYMineria)||
                this.verificaServicios(servicios)||this.subCondicion(construccion,'F')||
                this.subCondicion(comercio,'G');
    }

    public boolean verificaServicios(int[] servicios){
        return this.subCondicion(servicios,'D')||this.subCondicion(servicios,'E')||
                this.subCondicion(servicios,'H')||this.subCondicion(servicios,'I')||
                this.subCondicion(servicios,'J')||this.subCondicion(servicios,'K')||
                this.subCondicion(servicios,'L')||this.subCondicion(servicios,'M')||
                this.subCondicion(servicios,'N')||this.subCondicion(servicios,'P')||
                this.subCondicion(servicios,'Q')||this.subCondicion(servicios,'R');
    }

    public boolean verificaIndustriaYMineria(int[] industriaYMineria){
        return this.subCondicion(industriaYMineria,'B')||this.subCondicion(industriaYMineria,'C') ||
                this.subCondicion(industriaYMineria,'H')||this.subCondicion(industriaYMineria,'J');

    }


    public boolean subCondicion(int[] sector, char letra){
        if(this.esSectorIgual(letra)){
            return this.cumpleCondicion(sector);
        }
        return false;
    }

    public boolean cumpleCondicion(int[] sector){
        return (this.ventaAnualPromedio() > sector[0] && this.ventaAnualPromedio()<= sector[1]) &&
                (this.getCantEmpleados() > sector[2] && this.getCantEmpleados()<= sector[3]);
    }

    public boolean esSectorIgual(char letra){
        return this.getActividadId() == letra;
    }

}