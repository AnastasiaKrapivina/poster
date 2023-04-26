package ru.netology.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    PosterData film1 = new PosterData("Бладшот", "Боевик");
    PosterData film2 = new PosterData("Вперед", "Мультфильм");
    PosterData film3 = new PosterData("Отель Белград", "Комедия");
    PosterData film4 = new PosterData("Джентельмены", "Боевик");
    PosterData film5 = new PosterData("Человек невидимка", "Ужасы");
    PosterData film6 = new PosterData("Тролли. Мировой тур", "Мультфильм");
    PosterData film7 = new PosterData("Номер один", "Комедия");

    @Test
    public void testInputDataOutput() {
        PosterData poster = new PosterData("Номер один", "Комедия");
        poster.setFilmName("Номер один");
        poster.setFilmGenre("Комедия");

        Assertions.assertEquals("Номер один", poster.getFilmName());
        Assertions.assertEquals("Комедия", poster.getFilmGenre());
    }
    @Test
    public void testAdd() {
        PosterManager poster = new PosterManager();
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);
        poster.add(film6);
        poster.add(film7);

        PosterData[] expected = {film1, film2, film3, film4, film5, film6, film7};
        PosterData[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddOneValue() {
        PosterManager poster = new PosterManager();
        poster.add(film1);

        PosterData[] expected = {film1};
        PosterData[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddNullValue() {
        PosterManager poster = new PosterManager();
        poster.add(null);

        PosterData[] expected = {null};
        PosterData[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOneConstructor() {
        PosterManager poster = new PosterManager();
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);
        poster.add(film6);
        poster.add(film7);

        PosterData[] expected = {film7, film6, film5, film4, film3};
        PosterData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastTwoConstructor() {
        PosterManager poster = new PosterManager(7);
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);
        poster.add(film6);
        poster.add(film7);

        PosterData[] expected = {film7, film6, film5, film4, film3, film2, film1};
        PosterData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOneConstructorOneValue() {
        PosterManager poster = new PosterManager();
        poster.add(film1);

        PosterData[] expected = {film1};
        PosterData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastTwoConstructorOneValue() {
        PosterManager poster = new PosterManager(7);
        poster.add(film1);

        PosterData[] expected = {film1};
        PosterData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOneConstructorNullValue() {
        PosterManager poster = new PosterManager();
        poster.add(null);

        PosterData[] expected = {null};
        PosterData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastTwoConstructorNullValue() {
        PosterManager poster = new PosterManager(7);
        poster.add(null);

        PosterData[] expected = {null};
        PosterData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


