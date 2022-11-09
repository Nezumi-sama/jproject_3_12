package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterServiceTest {
    String film1 = "film1";
    String film2 = "film2";
    String film3 = "film3";
    String film4 = "film4";
    String film5 = "film5";
    String film6 = "film6";
    String film7 = "film7";
    String film8 = "film8";
    String film9 = "film9";
    String film10 = "film10";
    String film11 = "film11";
    String film12 = "film12";
    String film13 = "film13";

    @Test
    void shouldAddFirstFilm() {

        PosterService service = new PosterService();

        service.addFilm(film1);
        String[] actual = service.findAll();
        String[] expected = {"film1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddNoFirstFilm() {
        PosterService service = new PosterService();

        service.addFilm(film1);
        service.addFilm(film2);
        service.addFilm(film3);

        String[] actual = service.findAll();
        String[] expected = {"film1", "film2", "film3"};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        PosterService service = new PosterService();

        service.addFilm(film1);
        service.addFilm(film2);
        service.addFilm(film3);
        service.addFilm(film4);
        service.addFilm(film5);

        String[] actual = service.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5"};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastMoreTen() {
        PosterService service = new PosterService();

        service.addFilm(film1);
        service.addFilm(film2);
        service.addFilm(film3);
        service.addFilm(film4);
        service.addFilm(film5);
        service.addFilm(film6);
        service.addFilm(film7);
        service.addFilm(film8);
        service.addFilm(film9);
        service.addFilm(film10);
        service.addFilm(film11);
        service.addFilm(film12);
        service.addFilm(film13);

        String[] actual = service.findLast();
        String[] expected = {"film13", "film12", "film11", "film10", "film9", "film8", "film7", "film6",
                "film5", "film4"};

        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldFindLastLessTen() {
        PosterService service = new PosterService();

        service.addFilm(film1);
        service.addFilm(film2);
        service.addFilm(film3);
        service.addFilm(film4);

        String[] actual = service.findLast();
        String[] expected = {"film4", "film3", "film2", "film1"};

        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldFindLastMoreN() {
        PosterService service = new PosterService(5);

        service.addFilm(film1);
        service.addFilm(film2);
        service.addFilm(film3);
        service.addFilm(film4);
        service.addFilm(film5);
        service.addFilm(film6);
        service.addFilm(film7);
        service.addFilm(film8);

        String[] actual = service.findLast();
        String[] expected = {"film8", "film7", "film6", "film5", "film4"};

        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldFindLastLessN() {
        PosterService service = new PosterService(5);

        service.addFilm(film1);
        service.addFilm(film2);
        service.addFilm(film3);

        String[] actual = service.findLast();
        String[] expected = {"film3", "film2", "film1"};

        assertArrayEquals(expected, actual);
    }

}