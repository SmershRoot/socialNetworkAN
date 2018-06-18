package ru.sbt.na.soc.network.models;

public class Photo {
    private Long id;
    private String src;

    public Photo() {
    }

    public Photo(Long id) {
        this.id=id;
    }
    public Photo(String src) {
        this.src=src;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
