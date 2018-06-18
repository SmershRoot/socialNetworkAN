package ru.sbt.na.soc.network.photos;

public class Album implements IAlbum {
    private String albumDescription;
    private String albumCover;
    private  String filePath;
    enum accessLevels{FULL, FREENDS_ONLY, HIMSELF_ONLY, GROUP};



}