import java.util.ArrayList;
import java.util.List;
public abstract class Oyuncu {
    private double oyuncuID;

    private String oyuncuAdi;

    private int skor;

    List<Nesne>  nesnelist=new ArrayList<Nesne>();

    public Oyuncu(double oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    public Oyuncu() {
        super();
    }

    public List<Nesne> findall(){
        nesnelist.add(new Tas("TAS",20,0,2));
        nesnelist.add(new Kagit("KAGIT",20,0,2));
        nesnelist.add(new Makas("MAKAS",20,0,2));
        return nesnelist;
    }

    public void nesneSec(){

    }

    public void skorGoster(){ //oyuncuların skorları

    }



    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public double getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(double oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

}
