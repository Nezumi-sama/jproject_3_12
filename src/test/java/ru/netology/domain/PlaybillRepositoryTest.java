package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaybillRepositoryTest {

    PosterItem film1 = new PosterItem(1, "Послезавтра", 2004);
    PosterItem film2 = new PosterItem(2, "2012", 2009);
    PosterItem film3 = new PosterItem(3, "Класс убийц", 2015);
    PosterItem film4 = new PosterItem(4, "Одарённая", 2017);
    PosterItem film5 = new PosterItem(5, "Война будущего", 2021);

    @Test
    void shouldFindAll() {
        PlaybillRepository repo = new PlaybillRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        PosterItem[] expected = {film1, film2, film3};
        PosterItem[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAllEmpty() {
        PlaybillRepository repo = new PlaybillRepository();

        PosterItem[] expected = new PosterItem[0];
        PosterItem[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSave() {
        PlaybillRepository repo = new PlaybillRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);

        PosterItem[] expected = {film1, film2, film3, film4};
        PosterItem[] actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }
    @Test
    void shouldSaveEmpty() {
        PlaybillRepository repo = new PlaybillRepository();
        repo.save(film1);

        PosterItem[] expected = {film1};
        PosterItem[] actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldFindById() {

        PlaybillRepository repo = new PlaybillRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);

        PosterItem expected = film4;
        PosterItem actual = repo.findById(4);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindByIdNoFilm() {

        PlaybillRepository repo = new PlaybillRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);

        PosterItem expected = null;
        PosterItem actual = repo.findById(6);

        assertEquals(expected, actual);

    }


    @Test
    void shouldRemoveById() {
        PlaybillRepository repo = new PlaybillRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);

        repo.removeById(2);

        PosterItem[] expected = {film1, film3, film4, film5};
        PosterItem[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveAll() {
        PlaybillRepository repo = new PlaybillRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.removeAll();

        PosterItem[] expected = new PosterItem[0];
        PosterItem[] actual = repo.findAll();

        assertArrayEquals(expected, actual);

    }
}