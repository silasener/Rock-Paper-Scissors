public class Tas extends Nesne{
    private double katilik;

    public Tas(String isim, double dayaniklilik, double seviyePuani, double katilik) {
        super(isim, dayaniklilik, seviyePuani);
        this.katilik = katilik;
    }

    public Tas() {
        super();
    }

    @Override
    public void nesnePuaniGoster() {

    }

    @Override
    public void etkiHesapla() {

    }

    @Override
    public void durumGuncelle() {

    }

    public double getKatilik() {
        return katilik;
    }

    public void setKatilik(double katilik) {
        this.katilik = katilik;
    }

}
