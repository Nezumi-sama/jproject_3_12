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
    PosterItem film6 = new PosterItem(6, "Главный герой", 2021);
    PosterItem film7 = new PosterItem(7, "Люси", 2014);
    PosterItem film8 = new PosterItem(8, "Аватар", 2009);
    PosterItem film9 = new PosterItem(9, "Прибытие", 2016);
    PosterItem film10 = new PosterItem(10, "Алита: Боевой ангел", 2019);
    PosterItem film11 = new PosterItem(11, "Исходный код", 2011);
    PosterItem film12 = new PosterItem(12, "Обливион", 2013);


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


    @Test
    void getLastItemsMoreTen(){
        PosterItem[] items = {film1, film2, film3, film4, film5, film6,
                film7, film8, film9, film10, film11, film12};
        doReturn(items).when(repo).findAll();

        PosterItem[] expected = {film12, film11, film10, film9, film8, film7,
                film6, film5, film4, film3};
        PosterItem[] actual = manager.getLastItems();

        assertArrayEquals(expected, actual);

    }

    @Test
    void getLastItemsLessTen(){
        PosterItem[] items = {film1, film2, film3, film4, film5};
        doReturn(items).when(repo).findAll();

        PosterItem[] expected = {film5, film4, film3, film2, film1};
        PosterItem[] actual = manager.getLastItems();

        assertArrayEquals(expected, actual);

    }

    @Test
    void getLastItemsMoreN(){
        PosterItem[] items = {film1, film2, film3, film4, film5, film6,
                film7, film8, film9, film10, film11, film12};
        doReturn(items).when(repo).findAll();

        PosterItem[] expected = {film12, film11, film10, film9, film8};
        PosterItem[] actual = manager.getLastItems(5);

        assertArrayEquals(expected, actual);

    }

    @Test
    void getLastItemsLessN(){
        PosterItem[] items = {film1, film2, film3, film4};
        doReturn(items).when(repo).findAll();

        PosterItem[] expected = {film4, film3, film2, film1};
        PosterItem[] actual = manager.getLastItems(5);

        assertArrayEquals(expected, actual);

    }
}