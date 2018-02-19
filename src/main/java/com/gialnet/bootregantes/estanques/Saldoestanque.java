package com.gialnet.bootregantes.estanques;

import lombok.Data;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Saldoestanque implements Serializable {

    @Id
    private Integer minutos_comprados;
    private Integer minutos_saldo;
    private Integer estanque;

}
