package ru.sbt.na.soc.network.news;

import ru.sbt.na.soc.network.news.models.IPhoto;

public interface ShowNews extends IPhoto {
    public String photoAdd(String address);
    public String photoDelete(int idPhoto);
    public String photoView(int idPhoto) ;
    public String photoDownload(int idPhoto);
}

