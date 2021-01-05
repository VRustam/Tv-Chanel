package Lahiyeler;

import java.util.ArrayList;

public class Televizor {
    private String marka;
    private String olcu;
    private ArrayList<Kanal> kanallar;
    private boolean ac;



    public Televizor(String marka, String olcu) {
        this.marka = marka;
        this.olcu = olcu;
        kanallar = new ArrayList<>();
        kanallariyarat();
        this.ac = false;
    }

    public void tvAc(){
        if(ac == false){
            ac = true;
            System.out.println("Tv Acildi");
        }else{
            System.out.println("Tv Acilib");
        }
    }

    public void Tvsondur(){
        if(ac == true){
            ac = false;
            System.out.println("Tv sondu");
        }else{
            System.out.println("Tv sonub");
        }
    }



    private void kanallariyarat() {
        XeberKanali Fox = new XeberKanali("Fox",3,"Xeber");
        kanallar.add(Fox);
        XeberKanali CNN = new XeberKanali("CNN",1,"Xeber");
        kanallar.add(CNN);
        MusicCanal MTV = new MusicCanal("Mtv",2,"Music");
        kanallar.add(MTV);
        MusicCanal HitsTV = new MusicCanal("HitsTV",4,"Music");
        kanallar.add(HitsTV);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getOlcu() {
        return olcu;
    }

    public void setOlcu(String olcu) {
        this.olcu = olcu;
    }

    @Override
    public String toString() {
        return "Televizor{" +
                "marka='" + marka + '\'' +
                ", olcu='" + olcu + '\'' +
                ", TV duzeldi'" + '\'' +
                '}';
    }
}
