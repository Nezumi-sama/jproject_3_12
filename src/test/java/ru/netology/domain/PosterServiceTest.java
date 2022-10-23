package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterServiceTest {

    @Test
    void shouldAddFirstFilm() {

        PosterService service = new PosterService();
        String[] bill = new String[0];
        String film1 = "халк";

        String[] actual = service.addFilm(bill, film1);
        String[] expected = {"халк"};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddNoFirstFilm() {

        PosterService service = new PosterService();
        String[] bill = {"матрица", "тор", "блеф"};
        String film1 = "халк";

        String[] actual = service.addFilm(bill,film1);
        String[] expected = {"матрица", "тор", "блеф", "халк"};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        PosterService service = new PosterService();
        String[] bill = {"матрица", "тор", "блеф", "халк"};

        String[] actual = service.findAll(bill);
        String[] expected = {"матрица", "тор", "блеф", "халк"};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastMoreTen() {
        PosterService service = new PosterService();
        String[] bill = {"матрица", "тор", "блеф", "халк", "турбо", "шрек", "мулан", "тачки",
                "русалки", "начало", "довод", "титаник"};

        String[] actual = service.findLast(bill);
        String[] expected = {"титаник", "довод", "начало", "русалки", "тачки", "мулан", "шрек", "турбо",
                "халк", "блеф"};

        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldFindLastLessTen() {
        PosterService service = new PosterService();
        String[] bill = {"русалки", "начало", "довод", "титаник"};

        String[] actual = service.findLast(bill);
        String[] expected = {"титаник", "довод", "начало", "русалки"};

        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldFindLastMoreN() {
        PosterService service = new PosterService();
        String[] bill = {"матрица", "тор", "блеф", "халк", "турбо", "шрек", "мулан", "тачки",
                "русалки", "начало", "довод", "титаник"};

        String[] actual = service.findLastN(bill, 5);
        String[] expected = {"титаник", "довод", "начало", "русалки", "тачки"};

        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldFindLastLessN() {
        PosterService service = new PosterService();
        String[] bill = {"русалки", "начало", "довод", "титаник"};

        String[] actual = service.findLastN(bill, 5);
        String[] expected = {"титаник", "довод", "начало", "русалки"};

        assertArrayEquals(expected, actual);
    }

}