package com.jason.batch.project.job.jdbcjob;

public class FilmModel {
    private String filmName;
    private String director;
    private String timeLength;
    private String releaseDate;
    private  String personNum;
    private  String score;

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(String timeLength) {
        this.timeLength = timeLength;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPersonNum() {
        return personNum;
    }

    public void setPersonNum(String personNum) {
        this.personNum = personNum;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FilmModel{" +
                "filmName='" + filmName + '\'' +
                ", director='" + director + '\'' +
                ", timeLength='" + timeLength + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", personNum='" + personNum + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
