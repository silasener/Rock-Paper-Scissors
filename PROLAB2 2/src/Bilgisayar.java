import java.util.List;

public class Bilgisayar extends Oyuncu{

    public Bilgisayar(double oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }

    public Bilgisayar() {
        super();
    }

    @Override
    public List<Nesne> findall() {
        return super.findall();
    }

    @Override
    public void nesneSec() {
         bilgisayarbilgisayar b=new bilgisayarbilgisayar();
        for (int i = 0; i <5 ; i++) {
            b.listComboboxpc1new.get(i);
            b.listComboboxpc2new.get(i);
        }
    }


}
