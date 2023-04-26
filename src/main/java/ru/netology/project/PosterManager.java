package ru.netology.project;

public class PosterManager {

    private PosterData[] films = new PosterData[0];
    private  int limit;

    public PosterManager () {
        this.limit = 5;
    }

    public PosterManager (int limit) {
        this.limit = limit;

    }
    public void add(PosterData film) {
        PosterData[] tmp = new PosterData[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;
    }

    public PosterData[] findAll() {
        return films;
    }

    public PosterData[] findLast() {
        int outputResult;
        if (films.length < limit) {
            outputResult = films.length;
        } else {
            outputResult = limit;
        }
        PosterData[] tmp = new PosterData[outputResult];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
