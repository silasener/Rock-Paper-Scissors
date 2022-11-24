import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class kullanicibilgisayar extends JFrame {
    private JPanel kullanicipcpanel;
    private JButton MENUButton;
    private JComboBox comboBoxkullanici;
    private JComboBox comboBoxpc;
    private JButton k_pc_kullanicibutton;
    private JButton OYNAButton;
    private JButton k_pc_pcbutton;
    private JLabel durumsonuclabel;
    private JLabel pcskor;
    private JLabel kulnskor;
    private JButton tassecbutton;
    private JButton kagitsecbutton;
    private JButton makassecbutton;
    private JLabel beraberesayisi;
    private JButton bilgisayarRandomSecimButton;
    private JLabel oyunkazanani;
    private JButton comboboxİceriginiGuncelleButton;
    private JButton GİRİSButton;
    private JTextField textField1;
    private JLabel kullaniciad;
    private JButton kullaniciresim;
    private JButton pcresim;
    private JTextField kllncidayaniklilik;
    private JTextField pcdayaniklilik;
    private JTextField kullaniciseviye;
    private JTextField pcseviye;
    private JButton hamleSayisiButton;
    private JTextField hamlegir;
    private JLabel tdklabel;
    private JLabel tdpclabel;
    private JTextField KALANHAMLE;
    int oyuncu=0; int bilgisayar=0;
    int bilgisayarskor=0,kullaniciskor=0;
    int sinirlama=0,sinirpc=0;
    int baslangichamlesi=0;
    int beraberlik=0;
    int randomuazalt=0;
    int indis=-1;
    int say=0;
    String ad;
    int hamlesayisi;
    double kulltopdayaniklilik;
    double pctopdayaniklilik;
    int klisteindex=0;
    int pclisteindex=1;
    int pcdonustur;
    int kldonustur;

    List<Nesne>listComboboxnew=new ArrayList<>();
    List<Nesne>listComboboxkullnew=new ArrayList<>();
    Bilgisayar bilgisayarr=new Bilgisayar(1,"Bilgisayar",0);
    Kullanici kullanicii=new Kullanici(1,ad,0);
    Kullanici berabere=new Kullanici(0,"berabere,",0);

    List<Nesne> karsilastirma=new ArrayList<>();

    public void etkihesapla (List<Nesne> karsilastirma){
        if(karsilastirma.get(klisteindex).getIsim()=="TAS" && karsilastirma.get(pclisteindex).getIsim()=="KAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1.25);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if(karsilastirma.get(klisteindex).getIsim()=="TAS" && karsilastirma.get(pclisteindex).getIsim()=="MAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1.25);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }

        if (karsilastirma.get(klisteindex).getIsim()=="TAS" && karsilastirma.get(pclisteindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-4);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }

        if (karsilastirma.get(klisteindex).getIsim()=="TAS" && karsilastirma.get(pclisteindex).getIsim()=="USTAMAKAS" ){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2.5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2.5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }

        if (karsilastirma.get(klisteindex).getIsim()=="TAS" && karsilastirma.get(pclisteindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2.5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-0.625);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }
        if(karsilastirma.get(klisteindex).getIsim()=="KAGIT" && karsilastirma.get(pclisteindex).getIsim()=="MAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1.25);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if(karsilastirma.get(klisteindex).getIsim()=="KAGIT" && karsilastirma.get(pclisteindex).getIsim()=="TAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1.25);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }

        if (karsilastirma.get(klisteindex).getIsim()=="KAGIT" && karsilastirma.get(pclisteindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2.5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2.5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }
        if (karsilastirma.get(klisteindex).getIsim()=="KAGIT" && karsilastirma.get(pclisteindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2.5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-0.625);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if (karsilastirma.get(klisteindex).getIsim()=="KAGIT" && karsilastirma.get(pclisteindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-4);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }

        if(karsilastirma.get(klisteindex).getIsim()=="MAKAS" && karsilastirma.get(pclisteindex).getIsim()=="TAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1.25);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if(karsilastirma.get(klisteindex).getIsim()=="MAKAS" && karsilastirma.get(pclisteindex).getIsim()=="KAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1.25);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if (karsilastirma.get(klisteindex).getIsim()=="MAKAS" && karsilastirma.get(pclisteindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2.5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-0.625);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }
        if (karsilastirma.get(klisteindex).getIsim()=="MAKAS" && karsilastirma.get(pclisteindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-4);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }
        if (karsilastirma.get(klisteindex).getIsim()=="MAKAS" && karsilastirma.get(pclisteindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2.5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2.5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }

        if (karsilastirma.get(klisteindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pclisteindex).getIsim()=="MAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2.5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2.5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if (karsilastirma.get(klisteindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pclisteindex).getIsim()=="KAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-4);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }
        if (karsilastirma.get(klisteindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pclisteindex).getIsim()=="TAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-0.625);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2.5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }

        if (karsilastirma.get(klisteindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pclisteindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1.25);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if (karsilastirma.get(klisteindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pclisteindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1.25);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if (karsilastirma.get(klisteindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pclisteindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }


        if (karsilastirma.get(klisteindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pclisteindex).getIsim()=="MAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-4);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }

        if (karsilastirma.get(klisteindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pclisteindex).getIsim()=="KAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-0.625);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2.5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }

        if (karsilastirma.get(klisteindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pclisteindex).getIsim()=="TAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2.5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2.5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if (karsilastirma.get(klisteindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pclisteindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1.25);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }
        if (karsilastirma.get(klisteindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pclisteindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }
        if (karsilastirma.get(klisteindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pclisteindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1.25);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }

        //AGIRTAŞLA BAŞLAYAN 6 İF OLUCAK

        if (karsilastirma.get(klisteindex).getIsim()=="AGIRTAS" && karsilastirma.get(pclisteindex).getIsim()=="MAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-0.625);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2.5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }

        if (karsilastirma.get(klisteindex).getIsim()=="AGIRTAS" && karsilastirma.get(pclisteindex).getIsim()=="KAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2.5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-2.5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }

        if (karsilastirma.get(klisteindex).getIsim()=="AGIRTAS" && karsilastirma.get(pclisteindex).getIsim()=="TAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-2);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-4);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if (karsilastirma.get(klisteindex).getIsim()=="AGIRTAS" && karsilastirma.get(pclisteindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }
        if (karsilastirma.get(klisteindex).getIsim()=="AGIRTAS" && karsilastirma.get(pclisteindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1.25);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-5);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if (karsilastirma.get(klisteindex).getIsim()=="AGIRTAS" && karsilastirma.get(pclisteindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-5);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1.25);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));

        }

        if(karsilastirma.get(klisteindex).getIsim()=="TAS" && karsilastirma.get(pclisteindex).getIsim()=="TAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if(karsilastirma.get(klisteindex).getIsim()=="KAGIT" && karsilastirma.get(pclisteindex).getIsim()=="KAGIT"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }
        if(karsilastirma.get(klisteindex).getIsim()=="MAKAS" && karsilastirma.get(pclisteindex).getIsim()=="MAKAS"){
            karsilastirma.get(klisteindex).setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik()-1);
            karsilastirma.get(pclisteindex).setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik()-1);
            kllncidayaniklilik.setText(String.valueOf(karsilastirma.get(klisteindex).getDayaniklilik()));
            pcdayaniklilik.setText(String.valueOf(karsilastirma.get(pclisteindex).getDayaniklilik()));
        }

    }

    public void skorgoster(List<Nesne> karsilastirma){
        if ( karsilastirma.get(klisteindex).getDayaniklilik()==karsilastirma.get(pclisteindex).getDayaniklilik()) {
            kullaniciseviye.setText(String.valueOf(karsilastirma.get(klisteindex).getSeviyePuani()));
            pcseviye.setText(String.valueOf(karsilastirma.get(pclisteindex).getSeviyePuani()));
            pctopdayaniklilik=pctopdayaniklilik+karsilastirma.get(pclisteindex).getDayaniklilik();
            kulltopdayaniklilik=kulltopdayaniklilik+karsilastirma.get(klisteindex).getDayaniklilik();

        } else if (karsilastirma.get(klisteindex).getDayaniklilik()<karsilastirma.get(pclisteindex).getDayaniklilik()) {
            pctopdayaniklilik=pctopdayaniklilik+karsilastirma.get(pclisteindex).getDayaniklilik();
            kulltopdayaniklilik=kulltopdayaniklilik+karsilastirma.get(klisteindex).getDayaniklilik();
            karsilastirma.get(pclisteindex).setSeviyePuani(karsilastirma.get(pclisteindex).getSeviyePuani()+20);
            pcseviye.setText(String.valueOf(karsilastirma.get(pclisteindex).getSeviyePuani()));
            kullaniciseviye.setText(String.valueOf(karsilastirma.get(klisteindex).getSeviyePuani()));
            if(karsilastirma.get(pclisteindex).getSeviyePuani()>30&& karsilastirma.get(pclisteindex).getIsim()=="TAS"){
                if(karsilastirma.get(pclisteindex).getSeviyePuani()==40){
                    AgirTas agirTas=new AgirTas();
                    for (Nesne gez:listComboboxnew) {
                        if(gez==karsilastirma.get(pclisteindex)){
                            agirTas.setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik());
                            agirTas.setSeviyePuani(karsilastirma.get(pclisteindex).getSeviyePuani());
                            listComboboxnew.set(pcdonustur,agirTas);
                        }
                        pcdonustur++;
                    }
                    pcdonustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,"Bilgisayar: Tas nesnesi AgirTas nesnesine donustu!");
                }
            }if(karsilastirma.get(pclisteindex).getSeviyePuani()>30&& karsilastirma.get(pclisteindex).getIsim()=="KAGIT"){
                if(karsilastirma.get(pclisteindex).getSeviyePuani()==40){
                    OzelKagit ozelKagit=new OzelKagit();
                    for (Nesne gez:listComboboxnew) {
                        if(gez==karsilastirma.get(pclisteindex)){
                            ozelKagit.setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik());
                            ozelKagit.setSeviyePuani(karsilastirma.get(pclisteindex).getSeviyePuani());
                            listComboboxnew.set(pcdonustur,ozelKagit);
                        }
                        pcdonustur++;
                    }
                    pcdonustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,"Bilgisayar: Kagit nesnesi OzelKagit nesnesine donustu!");
                }
            }
            if(karsilastirma.get(pclisteindex).getSeviyePuani()>30&& karsilastirma.get(pclisteindex).getIsim()=="MAKAS"){
                if(karsilastirma.get(pclisteindex).getSeviyePuani()==40){
                    UstaMakas ustaMakas=new UstaMakas();
                    for (Nesne gez:listComboboxnew) {
                        if(gez==karsilastirma.get(pclisteindex)){
                            ustaMakas.setDayaniklilik(karsilastirma.get(pclisteindex).getDayaniklilik());
                            ustaMakas.setSeviyePuani(karsilastirma.get(pclisteindex).getSeviyePuani());
                            listComboboxnew.set(pcdonustur,ustaMakas);
                        }
                        pcdonustur++;
                    }
                    pcdonustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,"Bilgisayar: Makas nesnesi UstaMakas nesnesine donustu!");
                }
            }

            System.out.println("PC COMBOBOX"+listComboboxnew);


        } else if (karsilastirma.get(klisteindex).getDayaniklilik()>karsilastirma.get(pclisteindex).getDayaniklilik()) {
            kulltopdayaniklilik=kulltopdayaniklilik+karsilastirma.get(klisteindex).getDayaniklilik();
            pctopdayaniklilik=pctopdayaniklilik+karsilastirma.get(pclisteindex).getDayaniklilik();
            karsilastirma.get(klisteindex).setSeviyePuani(karsilastirma.get(klisteindex).getSeviyePuani()+20);
            kullaniciseviye.setText(String.valueOf(karsilastirma.get(klisteindex).getSeviyePuani()));
            pcseviye.setText(String.valueOf(karsilastirma.get(pclisteindex).getSeviyePuani()));
            if(karsilastirma.get(klisteindex).getSeviyePuani()>30&& karsilastirma.get(klisteindex).getIsim()=="TAS"){
                if(karsilastirma.get(klisteindex).getSeviyePuani()==40){
                    AgirTas agirTask=new AgirTas();
                    for (Nesne gezk:listComboboxkullnew) {
                        if(gezk==karsilastirma.get(klisteindex)){
                            agirTask.setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik());
                            agirTask.setSeviyePuani(karsilastirma.get(klisteindex).getSeviyePuani());
                            listComboboxkullnew.set(kldonustur,agirTask);
                        }
                        kldonustur++;
                    }
                    kldonustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,textField1.getText()+"  Tas nesnesi AgirTas nesnesine donustu!");
                }
            }
            if(karsilastirma.get(klisteindex).getSeviyePuani()>30&& karsilastirma.get(klisteindex).getIsim()=="KAGIT"){
                if(karsilastirma.get(klisteindex).getSeviyePuani()==40){
                    OzelKagit ozelKagitk=new OzelKagit();
                    for (Nesne gezk:listComboboxkullnew) {
                        if(gezk==karsilastirma.get(klisteindex)){

                            ozelKagitk.setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik());
                            ozelKagitk.setSeviyePuani(karsilastirma.get(klisteindex).getSeviyePuani());
                            listComboboxkullnew.set(kldonustur,ozelKagitk);
                        }
                        kldonustur++;
                    }
                    kldonustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,textField1.getText()+"  Kagit nesnesi OzelKagit nesnesine donustu!");
                }
            }
            if(karsilastirma.get(klisteindex).getSeviyePuani()>30&& karsilastirma.get(klisteindex).getIsim()=="MAKAS"){
                if (karsilastirma.get(klisteindex).getSeviyePuani()==40){
                    UstaMakas ustaMakask=new UstaMakas();
                    for (Nesne gezk:listComboboxkullnew) {
                        if(gezk==karsilastirma.get(klisteindex)){
                            ustaMakask.setDayaniklilik(karsilastirma.get(klisteindex).getDayaniklilik());
                            ustaMakask.setSeviyePuani(karsilastirma.get(klisteindex).getSeviyePuani());
                            listComboboxkullnew.set(kldonustur,ustaMakask);
                            kllncidayaniklilik.setText(String.valueOf(listComboboxkullnew.get(kldonustur).getDayaniklilik()));
                        }

                        kldonustur++;
                    }
                    kldonustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,textField1.getText()+"  Makas nesnesi UstaMakas nesnesine donustu!");
                }
            }

            System.out.println("KULLANICI COMBOBOX"+listComboboxkullnew);

        }
        if(baslangichamlesi==hamlesayisi-1){
            tdklabel.setText("Kullanici toplam dayaniklilik: "+kulltopdayaniklilik);
            tdpclabel.setText("Bilgisayar toplam dayaniklilik: "+pctopdayaniklilik);
            if(pctopdayaniklilik>kulltopdayaniklilik){
                oyunkazanani.setText("OYUNUN KAZANANİ : Bilgisayar");
            }
            else if(kulltopdayaniklilik>pctopdayaniklilik){
                oyunkazanani.setText("OYUNUN KAZANANİ : "+textField1.getText());
            }
            else{
                oyunkazanani.setText("OYUNUN KAZANANİ YOK , DURUM BERABERE");
            }
        }

    }

    public kullanicibilgisayar(){
        KALANHAMLE.setEnabled(false);
        hamlegir.setEnabled(false);
        hamleSayisiButton.setEnabled(false);
        kullaniciseviye.setEnabled(false);
        pcseviye.setEnabled(false);
        kllncidayaniklilik.setEnabled(false);
        pcdayaniklilik.setEnabled(false);
        comboBoxpc.setEnabled(false);
        kullaniciresim.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/kullanicii.png")));
        pcresim.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/pcresim.png")));
        kllncidayaniklilik.setEnabled(false);
        pcdayaniklilik.setEnabled(false);
        tassecbutton.setEnabled(false);
        makassecbutton.setEnabled(false);
        kagitsecbutton.setEnabled(false);
        comboboxİceriginiGuncelleButton.setEnabled(false);
        comboBoxkullanici.setEnabled(false);
        bilgisayarRandomSecimButton.setEnabled(false);
        OYNAButton.setEnabled(false);
        setContentPane(kullanicipcpanel);
        setTitle("kullanici-bilgisayar oyun ekrani");
        setSize(1500,800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        tassecbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/tas.png")));
        kagitsecbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/kagit.png")));
        makassecbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/makas.png")));


        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prolab prolab=new prolab();
                setVisible(false);
            }
        });


        comboBoxkullanici.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tas tas1=new Tas();
                Kagit kagit1=new Kagit();
                Makas makas1=new Makas();
                AgirTas agirtas1=new AgirTas();
                OzelKagit ozelkagit1=new OzelKagit();
                UstaMakas ustamakas1=new UstaMakas();
                if(baslangichamlesi!=0 && baslangichamlesi%5!=0){
                    comboboxİceriginiGuncelleButton.setEnabled(false);
                }
                if(comboBoxkullanici.getSelectedItem().getClass().equals(tas1.getClass())){
                    Tas tas=(Tas) comboBoxkullanici.getSelectedItem();
                    karsilastirma.add(klisteindex,tas);
                    k_pc_kullanicibutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/tas.png")));
                    oyuncu=0;
                }
                else if (comboBoxkullanici.getSelectedItem().getClass().equals(kagit1.getClass()))
                {  Kagit kagit=(Kagit) comboBoxkullanici.getSelectedItem();
                    karsilastirma.add(klisteindex,kagit);
                    k_pc_kullanicibutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/kagit.png")));
                    oyuncu=1;
                }
                else if(comboBoxkullanici.getSelectedItem().getClass().equals(makas1.getClass()))
                { Makas makas=(Makas) comboBoxkullanici.getSelectedItem();
                    karsilastirma.add(klisteindex,makas);
                    k_pc_kullanicibutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/makas.png")));
                    oyuncu=2;
                }
                else if(comboBoxkullanici.getSelectedItem().getClass().equals(agirtas1.getClass())){
                    AgirTas at1=(AgirTas) comboBoxkullanici.getSelectedItem();
                    karsilastirma.add(klisteindex,at1);
                    k_pc_kullanicibutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/agirtas.png")));
                    oyuncu=0;
                }
                else if(comboBoxkullanici.getSelectedItem().getClass().equals(ozelkagit1.getClass())){
                    OzelKagit ok1=(OzelKagit) comboBoxkullanici.getSelectedItem();
                    karsilastirma.add(klisteindex,ok1);
                    k_pc_kullanicibutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/ozelkagit.png")));
                    oyuncu=0;
                }
                else if(comboBoxkullanici.getSelectedItem().getClass().equals(ustamakas1.getClass())){
                    UstaMakas um1=(UstaMakas) comboBoxkullanici.getSelectedItem();
                    karsilastirma.add(klisteindex,um1);
                    k_pc_kullanicibutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/ustamakas.png")));
                    oyuncu=0;
                }
            }
        });

        OYNAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tas tas2=new Tas();
                Kagit kagit2=new Kagit();
                Makas makas2=new Makas();
                AgirTas agirtas2=new AgirTas();
                OzelKagit ozelkagit2=new OzelKagit();
                UstaMakas ustamakas2=new UstaMakas();
                if(baslangichamlesi!=0 && baslangichamlesi%4==0){
                    OYNAButton.setEnabled(false);
                }
                comboboxİceriginiGuncelleButton.setEnabled(true);
                if(baslangichamlesi<hamlesayisi){
                    if(indis!=-1){
                        comboBoxpc.removeItemAt(indis);
                    }
                    if(randomuazalt==5){
                        for (Nesne a:listComboboxnew) {
                            comboBoxpc.addItem(a);
                        }
                        randomuazalt=0;
                    }
                    indis = (int) (Math.random() * (5-randomuazalt));
                    randomuazalt++;
                    comboBoxpc.setSelectedIndex(indis);
                    if(comboBoxpc.getSelectedItem().getClass().equals(tas2.getClass()))
                    {  Tas taspc=(Tas) comboBoxpc.getSelectedItem();
                        karsilastirma.add(pclisteindex,taspc);
                        k_pc_pcbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/tas.png")));
                        bilgisayar=0;
                    }
                    else if(comboBoxpc.getSelectedItem().getClass().equals(kagit2.getClass()))
                    {  Kagit kagitpc=(Kagit) comboBoxpc.getSelectedItem();
                        karsilastirma.add(pclisteindex,kagitpc);
                        k_pc_pcbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/kagit.png")));
                        bilgisayar=1;
                    }
                    else if (comboBoxpc.getSelectedItem().getClass().equals(makas2.getClass())){
                        Makas makaspc=(Makas) comboBoxpc.getSelectedItem();
                        karsilastirma.add(pclisteindex,makaspc);
                        k_pc_pcbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/makas.png")));
                        bilgisayar=2;
                    }
                    else if(comboBoxpc.getSelectedItem().getClass().equals(agirtas2.getClass()))
                    {  AgirTas at2=(AgirTas) comboBoxpc.getSelectedItem();
                        karsilastirma.add(pclisteindex,at2);
                        k_pc_pcbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/agirtas.png")));
                    }
                    else if(comboBoxpc.getSelectedItem().getClass().equals(ozelkagit2.getClass()))
                    {  OzelKagit ok2=(OzelKagit) comboBoxpc.getSelectedItem();
                        karsilastirma.add(pclisteindex,ok2);
                        k_pc_pcbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/ozelkagit.png")));
                    }
                    else if(comboBoxpc.getSelectedItem().getClass().equals(ustamakas2.getClass()))
                    {  UstaMakas um2=(UstaMakas) comboBoxpc.getSelectedItem();
                        karsilastirma.add(pclisteindex,um2);
                        k_pc_pcbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/ustamakas.png")));
                    }

                    etkihesapla(karsilastirma);
                    skorgoster(karsilastirma);
                    klisteindex++;
                    pclisteindex++;
                }
                else{
                    etkihesapla(karsilastirma);
                    skorgoster(karsilastirma);
                    OYNAButton.setEnabled(false);
                }
                baslangichamlesi++;
                KALANHAMLE.setText(String.valueOf(hamlesayisi-baslangichamlesi));
                if(baslangichamlesi==hamlesayisi){
                    comboboxİceriginiGuncelleButton.setEnabled(false);
                }
                comboBoxkullanici.setEnabled(false);
                OYNAButton.setEnabled(false);

            }
        });


        tassecbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sinirlama>=4){
                    tassecbutton.setEnabled(false);
                    makassecbutton.setEnabled(false);
                    kagitsecbutton.setEnabled(false);
                    bilgisayarRandomSecimButton.setEnabled(true);
                }
                if(sinirlama<5)
                {  Kullanici k=new Kullanici(0,"k1",0);
                    DefaultComboBoxModel<Nesne> defaultComboBoxModel=new DefaultComboBoxModel<Nesne>();
                    new DefaultComboBoxModel<Nesne>();
                    List<Nesne> listedetut=new ArrayList<>();
                    listedetut= k.findall();
                    defaultComboBoxModel.addElement(listedetut.get(0));
                    listComboboxkullnew.add(sinirlama,listedetut.get(0));
                    comboBoxkullanici.addItem(listedetut.get(0));
                    comboBoxkullanici.setRenderer(new NesneListCellRenderer());
                }
                sinirlama++;

            }
        });


        kagitsecbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sinirlama>=4){
                    kagitsecbutton.setEnabled(false);
                    tassecbutton.setEnabled(false);
                    makassecbutton.setEnabled(false);
                    bilgisayarRandomSecimButton.setEnabled(true);
                }
                if (sinirlama <5) {

                    Kullanici k=new Kullanici(0,"k1",0);
                    DefaultComboBoxModel<Nesne> defaultComboBoxModel=new DefaultComboBoxModel<Nesne>();
                    new DefaultComboBoxModel<Nesne>();
                    List<Nesne> listedetut=new ArrayList<>();
                    listedetut= k.findall();
                    defaultComboBoxModel.addElement(listedetut.get(1));
                    listComboboxkullnew.add(sinirlama,listedetut.get(1));
                    comboBoxkullanici.addItem(listedetut.get(1));
                    comboBoxkullanici.setRenderer(new NesneListCellRenderer());
                }
                sinirlama++;
            }
        });

        makassecbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sinirlama>=4){
                    makassecbutton.setEnabled(false);
                    tassecbutton.setEnabled(false);
                    kagitsecbutton.setEnabled(false);
                    bilgisayarRandomSecimButton.setEnabled(true);
                }
                if(sinirlama<5){
                    Kullanici k=new Kullanici(0,"k1",0);
                    DefaultComboBoxModel<Nesne> defaultComboBoxModel=new DefaultComboBoxModel<Nesne>();
                    new DefaultComboBoxModel<Nesne>();
                    List<Nesne> listedetut=new ArrayList<>();
                    listedetut= k.findall();
                    defaultComboBoxModel.addElement(listedetut.get(2));
                    listComboboxkullnew.add(sinirlama,listedetut.get(2));
                    comboBoxkullanici.addItem(listedetut.get(2));
                    comboBoxkullanici.setRenderer(new NesneListCellRenderer());
                }
                sinirlama++;
            }
        });

        bilgisayarRandomSecimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OYNAButton.setEnabled(true);
                for(int p=0;p<5;p++){
                    int random=(int)(Math.random()*3);
                    Bilgisayar bilgisayar=new Bilgisayar();
                    List<Nesne> listedetut=new ArrayList<>();
                    DefaultComboBoxModel<Nesne> defaultComboBoxModel=new DefaultComboBoxModel<Nesne>();
                    new DefaultComboBoxModel<Nesne>();
                    listedetut= bilgisayar.findall();
                    defaultComboBoxModel.addElement(listedetut.get(random));
                    comboBoxpc.addItem(listedetut.get(random));
                    listComboboxnew.add(p,listedetut.get(random));
                    comboBoxpc.setRenderer(new NesneListCellRenderer());
                    sinirpc++;
                    if (sinirpc==5){
                        bilgisayarRandomSecimButton.setEnabled(false);
                        System.out.println("bilgisayar secimleri");
                        for (Nesne a:listComboboxnew) {
                            System.out.println(a.getIsim());
                        }
                    }
                }
            }
        });
        comboboxİceriginiGuncelleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OYNAButton.setEnabled(true);
                if(say!=0 && say==4 || say==9 || say==14 || say==19 || say==24 || say==29 || say==34 || say==39 || say==44 || say==49){
                    OYNAButton.setEnabled(false);
                }
                comboBoxkullanici.setEnabled(true);
                if (baslangichamlesi > 0 && randomuazalt!=5) {
                    comboBoxkullanici.removeItem(comboBoxkullanici.getSelectedItem());
                }
                if(randomuazalt==5){
                    comboBoxkullanici.removeAllItems();
                    for (Nesne b:listComboboxkullnew) {
                        comboBoxkullanici.addItem(b);
                        OYNAButton.setEnabled(true);
                        comboboxİceriginiGuncelleButton.setEnabled(false);
                    }
                }
                say++;
            }
        });

        GİRİSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // kullaniciad.setText(textField1.getText());
                GİRİSButton.setEnabled(false);
                hamlegir.setEnabled(true);
                hamleSayisiButton.setEnabled(true);
                textField1.setEnabled(false);
            }
        });

        hamleSayisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tassecbutton.setEnabled(true);
                makassecbutton.setEnabled(true);
                kagitsecbutton.setEnabled(true);
                comboboxİceriginiGuncelleButton.setEnabled(false);
                comboBoxkullanici.setEnabled(true);
                hamlesayisi= Integer.parseInt(hamlegir.getText());
                hamleSayisiButton.setEnabled(false);
                hamlegir.setEnabled(false);
                KALANHAMLE.setText(String.valueOf(hamlesayisi));
            }
        });
    }



    private class NesneListCellRenderer extends DefaultListCellRenderer {
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            if (value instanceof Nesne) {
                Nesne nesne = (Nesne) value;
                //  value = nesne.getIsim();

            }
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        }
    }




}