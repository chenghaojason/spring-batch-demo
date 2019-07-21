package com.jason.batch.project.job.fixlength;

public class MusicModel {
    //musicName,singer,duration,album
    private String musicName;
    private String singer;
    private String duration;//时长
    private String album;

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "MusicModel{" +
                "musicName='" + musicName + '\'' +
                ", singer='" + singer + '\'' +
                ", duration='" + duration + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
