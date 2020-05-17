package Organizacion.EntidadJuridica;

import Organizacion.EntidadBase.EntidadBase;
import Organizacion.Organizacion;

public abstract class EntidadJuridica implements Organizacion {
    private String entidadNombre;
    private String entidadRazonSocial;
    private int entidadCuit;
    private int entidadCodigoPostal;
    private int entidadCodiGJ;
    private EntidadBase entidadBase;
    //private entidadTipo; no entendi esto
}
