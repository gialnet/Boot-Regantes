package com.gialnet.angularnombres;

public class Profiles {
    private long id;
    private String content;
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
