public class OzelKagit extends Kagit
{
    private double kalinlik;

    public OzelKagit(double dayaniklilik, double seviyePuani, double nufuz, double kalinlik) {
        super("OZELKAGIT", dayaniklilik, seviyePuani, nufuz);
        this.kalinlik = kalinlik;
    }

    public OzelKagit() {
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
}
