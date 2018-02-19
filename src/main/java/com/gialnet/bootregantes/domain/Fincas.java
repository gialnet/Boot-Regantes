package com.gialnet.bootregantes.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Fincas  implements Serializable {

    //@GeneratedValue
    @Id
    private String codigo;


}
