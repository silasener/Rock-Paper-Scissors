public abstract class Nesne {

    private String isim;
   private double dayaniklilik;
   private double seviyePuani;

    public Nesne(String isim, double dayaniklilik, double seviyePuani) {
        this.isim = isim;
        this.dayaniklilik = dayaniklilik;
        this.seviyePuani = seviyePuani;

    }

    public Nesne(){

        super();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void nesnePuaniGoster(){ // Nesnelerin dayanıklılık ve seviye puanı ozelliklerini oyunda gostermek
    }

    public void etkiHesapla(){ //Nesnelerin rakip nesneye karsı atak etkisini hesaplamak

    }
    public void durumGuncelle(){ // Nesnelerin karsılıklı atakları sonucunda etki degerleri kadar dayanıklılık degerlerinin azaltılması ve seviye puanı guncellemeler
    }
    public double getDayaniklilik() {
        return dayaniklilik;
    }

    public int setDayaniklilik(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
        return 0;
    }

    public double getSeviyePuani() {
        return seviyePuani;
    }

    public void setSeviyePuani(double seviyePuani) {
        this.seviyePuani = seviyePuani;
    }



}
