package Lahiyeler;

public class Kanal {
    private String Ad;
    private int kanalNo;

    public Kanal(String ad, int kanalNo) {
        Ad = ad;
        this.kanalNo = kanalNo;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public int getKanalNo() {
        return kanalNo;
    }

    public void setKanalNo(int kanalNo) {
        this.kanalNo = kanalNo;
    }
}
