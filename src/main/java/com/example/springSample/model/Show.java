package com.example.springSample.model;

public class Show {
    private String showName;
    private String showType;
    private int seriesNumber;
    private int episodeNumber;


    public Show(String showName, String showType, int seriesNumber, int episodeNumber) {
        this.showName = showName;
        this.showType = showType;
        this.seriesNumber = seriesNumber;
        this.episodeNumber = episodeNumber;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
}
