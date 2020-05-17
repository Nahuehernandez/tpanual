package Organizacion.EntidadJuridica.Empresa.TipoEmpresa;

import Organizacion.EntidadJuridica.Empresa.Empresa;

public class MedianaTramoDos implements TipoEmpresa{
    @Override
    public void recategorizar(Empresa empresa) throws Exception {
        if(empresa.cumpleCondicionMicro()){
            empresa.setTipoEmpresa(new Micro());
        }else{
            if(empresa.cumpleCondicionPequena()){
                empresa.setTipoEmpresa(new Pequena());
            }else{
                if(empresa.cumpleCondicionMedidanaTramoUno()){
                    empresa.setTipoEmpresa(new MedianaTramoUno());
                }else{
                    throw new Exception("La empresa sigue siendo Mediana Tramo Dos");
                }
            }
        }
    }
}
