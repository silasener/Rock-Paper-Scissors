import java.util.List;


public class Kullanici extends Oyuncu{


    public Kullanici(double oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);

    }

    public Kullanici() {
        super();
    }

    @Override
    public List<Nesne> findall() {

        return super.findall();
    }

    @Override
    public void skorGoster() {
        super.skorGoster();
    }

    @Override
    public void nesneSec() {
        kullanicibilgisayar kbkb=new kullanicibilgisayar();
        for (int i = 0; i <5 ; i++) {
           kbkb.listComboboxkullnew.get(i);
           kbkb.listComboboxnew.get(i);
        }
    }


}
