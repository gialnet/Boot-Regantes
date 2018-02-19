package com.gialnet.bootregantes.estanques;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PROPIEDADES")
public class Estanques implements Serializable {
    @Id
    private String codigo;

    private String descripcion;

    private String comunero;

    private String propietario;

    private String comunidad;

    private String unidades;

    private String horas;

    private String anejo;

    private String ordenriego;

    public Estanques() {/* JPA need */  }

}
