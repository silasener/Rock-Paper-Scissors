public class Makas extends Nesne{
private double keskinlik;

    public Makas(String isim, double dayaniklilik, double seviyePuani, double keskinlik) {
        super(isim, dayaniklilik, seviyePuani);
        this.keskinlik = keskinlik;
    }

    public Makas() {
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

    public double getKeskinlik() {
        return keskinlik;
    }

    public void setKeskinlik(double keskinlik) {
        this.keskinlik = keskinlik;
    }
}
