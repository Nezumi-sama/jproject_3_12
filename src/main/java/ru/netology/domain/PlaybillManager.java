package ru.netology.domain;

public class PlaybillManager {
    private PlaybillRepository repo;

    public PlaybillManager(PlaybillRepository repo) {
        this.repo = repo;
    }

    public void addItem(PosterItem item) {
        repo.save(item);
    }

    public PosterItem[] getAllItems() {
        PosterItem[] allItems = repo.findAll();
        return allItems;
    }

    public PosterItem[] getLastItems() {
        PosterItem[] allItems = repo.findAll();
        int count = 10;
        int number = 0;
        if (allItems.length < 10) {
            count = allItems.length;
        }
        PosterItem[] lastItems = new PosterItem[count];

        for (int i = allItems.length - 1; i > allItems.length - count - 1; i--) {
            lastItems[number] = allItems[i];
            number++;
        }

        return lastItems;
    }

    public PosterItem[] getLastItems(int count) {
        PosterItem[] allItems = repo.findAll();
        int number = 0;
        if (allItems.length < count) {
            count = allItems.length;
        }
        PosterItem[] lastItems = new PosterItem[count];

        for (int i = allItems.length - 1; i > allItems.length - count - 1; i--) {
            lastItems[number] = allItems[i];
            number++;
        }

        return lastItems;
    }

}
