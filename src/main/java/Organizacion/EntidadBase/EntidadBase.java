package Organizacion.EntidadBase;

import Organizacion.EntidadJuridica.EntidadJuridica;
import Organizacion.Organizacion;

public class EntidadBase implements Organizacion{
    private String entidadNombre;
    private String entidadDescripcion;
    private EntidadJuridica orgJuridica;

    @Override
    public int totalVentas() {
        return 0;
    }
}
