package com.gialnet.bootregantes.tickets;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Tickets implements Serializable {

    @Id
    private String id;
    private String estanque;
    private String nticket;
    private String canal_compra;
    private String minutos_comprados;
    private String fecha_buy;
    private String pendiente;
    private String observaciones;

}
