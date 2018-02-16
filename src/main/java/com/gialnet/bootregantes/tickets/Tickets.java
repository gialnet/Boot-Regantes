package com.gialnet.bootregantes.tickets;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
// This is the Hibernate way
@NamedStoredProcedureQuery(
        name = "ToBuyTicketsMinutes",
        procedureName = "ComprarTicketMinutos",
        parameters = {
                @StoredProcedureParameter(name = "estanque", mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(name = "minutos", mode = ParameterMode.IN, type = Integer.class)
        })
public class Tickets implements Serializable {

    @Id
    private Integer id;
    private Integer estanque;
    private Integer nticket;
    private String canal_compra;
    private Integer minutos_comprados;
    private Date fecha_buy;
    private String pendiente;
    private String observaciones;

}
