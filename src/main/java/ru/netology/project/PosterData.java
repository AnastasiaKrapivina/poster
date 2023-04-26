package ru.netology.project;

public class PosterData {
    private String filmName;
    private String filmGenre;

    public PosterData(String filmName, String filmGenre) {
        this.filmName = filmName;
        this.filmGenre = filmGenre;
    }
    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String serialNumber) {
        this.filmGenre = serialNumber;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String movieName) {
        this.filmName = movieName;
    }
}