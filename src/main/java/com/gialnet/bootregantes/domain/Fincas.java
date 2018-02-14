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
    private Long id;

    @Column
    private String title;

    public Fincas() {
    }

    public Fincas(Long id, String title) {
        this.id = id;
        this.title = title;
    }


    @Override
    public String toString() {
        return "Fincas{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
