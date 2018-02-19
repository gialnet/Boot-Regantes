package com.gialnet.bootregantes.fincas;

import lombok.Data;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
//@Entity(name = "PROPIEDADES")
@Entity
public class Propiedades implements Serializable {

    @Id
    private String codigo;
    private String descripcion;
    private String horas;
    private String comunero;
    private String ordenriego;
    private String propietario;
    private String unidades;
    private String anejo;
    private String comunidad;

}