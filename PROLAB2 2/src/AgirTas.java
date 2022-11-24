public class AgirTas extends Tas{
    private double sicaklik;

    public AgirTas(double dayaniklilik, double seviyePuani, double katilik, double sicaklik) {
        super("AGIRTAS", dayaniklilik, seviyePuani, katilik);
        this.sicaklik = sicaklik;
    }

    public AgirTas() {
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

    public double getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(double sicaklik) {
        this.sicaklik = sicaklik;
    }
}
