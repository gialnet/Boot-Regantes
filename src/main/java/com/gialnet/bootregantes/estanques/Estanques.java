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
    @Column
    private String descripcion;
    @Column
    private String comunero;
    @Column
    private String propietario;
    @Column
    private String comunidad;
    @Column
    private String unidades;
    @Column
    private String horas;
    @Column
    private String anejo;

    @Column
    private String ordenriego;

    public Estanques() {/* JPA need */  }

}
