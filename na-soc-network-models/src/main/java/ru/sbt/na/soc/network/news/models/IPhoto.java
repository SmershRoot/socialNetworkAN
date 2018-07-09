package ru.sbt.na.soc.network.news.models;



public interface IPhoto {
    public String photoAdd(String address);
    public String photoDelete(int idPhoto);
    public String photoView(int idPhoto);
    public String photoDownload(int idPhoto);



}
