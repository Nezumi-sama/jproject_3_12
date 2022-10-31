package ru.netology.domain;

public class PosterService {
    private String[] playbill = new String[0];

    public void addFilm(String film) {
        String[] playbillNew = new String[playbill.length + 1];

        if (playbill.length == 0) {
            playbillNew[0] = film;
        } else {
            for (int i = 0; i < playbill.length; i++) {
                playbillNew[i] = playbill[i];
            }
            playbillNew[playbillNew.length - 1] = film;
        }
        playbill = playbillNew;
      //  return playbill;
    }


    public String[] findAll() {
        return playbill;
    }


    public String[] findLast() {
        int count = 10;
        int number = 0;
        if (playbill.length < 10) {
            count = playbill.length;
        }
        String[] playbillLast = new String[count];
        for (int i = playbill.length - 1; i > playbill.length - count - 1; i--) {
            playbillLast[number] = playbill[i];
            number++;
        }

        return playbillLast;
    }


    public String[] findLastN(int count) {
        int number = 0;
        if (playbill.length < count) {
            count = playbill.length;
        }
        String[] playbillLast = new String[count];
        for (int i = playbill.length - 1; i > playbill.length - count - 1; i--) {
            playbillLast[number] = playbill[i];
            number++;
        }

        return playbillLast;
    }

}
