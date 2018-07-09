package ru.sbt.na.soc.network.news.models;

public class Photo implements IPhoto{
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

    public String photoAdd(String address) {

        return "Фото добавлено";
    }
    public String photoDelete(int idPhoto) {
        return "Фото удалено";
    }
        public String photoView(int idPhoto) {

        return "Фото доступно для просмотра";
    }
    public String photoDownload(int idPhoto){
        return "Фото загружено";
    }

}
