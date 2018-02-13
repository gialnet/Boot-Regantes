package com.gialnet.angularnombres.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profiles {

    @Id
    private long id;

    @Column
    private String content;

    @Column
    private int age;

    public Profiles(long id, String content, int age) {
        this.id = id;
        this.content = content;
        this.age = age;
    }

    public Profiles() {
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Profiles{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", age=" + age +
                '}';
    }
}
