package ru.netology.domain;

public class PlaybillRepository {
    private PosterItem[] playbills = new PosterItem[0];

    public PosterItem[] findAll(){
        return playbills;
    }

    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[playbills.length + 1];

        if (playbills.length == 0) {
            tmp[0] = item;
        } else {
            for (int i = 0; i < playbills.length; i++) {
                tmp[i] = playbills[i];
            }
            tmp[tmp.length - 1] = item;
        }
        playbills = tmp;
    }

    public PosterItem findById(int id){
        PosterItem element = null;

        for (PosterItem item : playbills){
            if (item.getId() == id){
                element = item;
            }
        }
        return element;
   }


    public void removeById(int id){
        PosterItem[] tmp = new PosterItem[playbills.length - 1];
        int number = 0;

        for (int i = 0; i< playbills.length; i++){
            if (playbills[i].getId() != id){
                tmp[number] = playbills[i];
                number++;
            }
        }
        playbills = tmp;

    }


    public void removeAll(){
        playbills = new PosterItem[0];
    }

}
