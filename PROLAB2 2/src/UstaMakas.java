public class UstaMakas extends Makas{
    private double direnc;

    public UstaMakas(double dayaniklilik, double seviyePuani, double keskinlik, double direnc) {
        super("USTAMAKAS", dayaniklilik, seviyePuani, keskinlik);
        this.direnc = direnc;
    }

    public UstaMakas() {
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
