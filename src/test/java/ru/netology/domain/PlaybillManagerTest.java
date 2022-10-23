package ru.netology.domain;

//import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PlaybillManagerTest {
    //    PlaybillRepository repo = new PlaybillRepository();
    PlaybillRepository repo = Mockito.mock(PlaybillRepository.class);
    PlaybillManager manager = new PlaybillManager(repo);

    PosterItem film1 = new PosterItem(1, "Послезавтра", 2004);
    PosterItem film2 = new PosterItem(2, "2012", 2009);
    PosterItem film3 = new PosterItem(3, "Класс убийц", 2015);
    PosterItem film4 = new PosterItem(4, "Одарённая", 2017);
    PosterItem film5 = new PosterItem(5, "Война будущего", 2021);

/*    @BeforeEach
    public void setup(){
        manager.addItem(film1);
        manager.addItem(film2);
        manager.addItem(film3);
        manager.addItem(film4);
    }
*/

    @Test
    void addItem() {
        PosterItem[] items = {film1, film2, film3, film4};
        doReturn(items).when(repo).findAll();

        PosterItem[] expected = {film1, film2, film3, film4};
        manager.addItem(film4);
        PosterItem[] actual = manager.getAllItems();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllItems() {

        PosterItem[] items = {film1, film2, film3, film4};
        doReturn(items).when(repo).findAll();

        PosterItem[] expected = {film1, film2, film3, film4};
        PosterItem[] actual = manager.getAllItems();

        assertArrayEquals(expected, actual);
    }

}