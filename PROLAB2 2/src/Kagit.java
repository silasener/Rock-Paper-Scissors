public class Kagit extends Nesne{
  private double nufuz;

  public Kagit(String isim, double dayaniklilik, double seviyePuani, double nufuz) {
    super(isim, dayaniklilik, seviyePuani);
    this.nufuz = nufuz;
  }

  public Kagit() {
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


  public double getNufuz() {
    return nufuz;
  }

  public void setNufuz(double nufuz) {
    this.nufuz = nufuz;
  }
}
