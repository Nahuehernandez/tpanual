package Organizacion.EntidadJuridica.Empresa.TipoEmpresa;

import Organizacion.EntidadJuridica.Empresa.Empresa;

public class MedianaTramoUno implements TipoEmpresa{
    @Override
    public void recategorizar(Empresa empresa) throws Exception {
        if(empresa.cumpleCondicionMicro()){
            empresa.setTipoEmpresa(new Micro());
        }else{
            if(empresa.cumpleCondicionPequena()){
                empresa.setTipoEmpresa(new Pequena());
            }else{
                if(empresa.cumpleCondicionMedianaTramoDos()){
                    empresa.setTipoEmpresa(new MedianaTramoDos());
                }else{
                    throw new Exception("La empresa sigue siendo Mediana Tramo Uno");
                }
            }
        }
    }
}
