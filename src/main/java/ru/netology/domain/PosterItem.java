package ru.netology.domain;

public class PosterItem {
    private int id;
    private String filmTitle;
    private int releaseYear;

    public PosterItem(int id, String filmTitle, int releaseYear) {
        this.id = id;
        this.filmTitle = filmTitle;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


}
