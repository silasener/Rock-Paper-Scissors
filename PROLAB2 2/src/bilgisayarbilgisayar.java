import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class bilgisayarbilgisayar extends JFrame {
    private JPanel pcpcpanel;
    private JButton MENUButton;
    private JComboBox comboBoxpc1;
    private JComboBox comboBoxpc2;
    private JButton pc_pc_pc2button;
    private JButton pc_pc_pc1button;
    private JButton OYNAButton;
    private JLabel sonucdurumlabel;
    private JLabel pc2skor;
    private JLabel pc1skor;
    private JButton pc2RandomNesneSecButton;
    private JLabel beraberlikdurumu;
    private JButton pc1RandomNesneSecButton;
    private JLabel oyunkazanani;
    private JButton pc1resim;
    private JButton pc2resim;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField pc2seviye;
    private JTextField pc1seviye;
    private JButton hamleSayisiButton;
    private JTextField hamlegir;
    private JLabel sonucdayaniklilik;
    private JTextField KALANHAMLETextField;

    int bilgisayar1=0,bilgisayar2=0;
    int pc1donustur;
    int pc2donustur;
    int bilgisayar1skor=0,bilgisayar2skor=0;
    int baslangichamlesi=0;
    int beraberlik=0;
    int sinirpc1=0, sinirpc2=0;
    int indis=-1,indis2=-1;
    int randomuazalt=0,randomazalt2=0;
    int oynaac=1;
    int pc1listeindex=0;
    int pc2listeindex=1;
    double pc1topdayaniklilik;
    double pc2topdayaniklilik;
    int hamlesayisi;
    List<Nesne>listComboboxpc1new=new ArrayList<>();
    List<Nesne>listComboboxpc2new=new ArrayList<>();
    List<Nesne> karsilastirma=new ArrayList<>();


    Bilgisayar bilgisayarr1=new Bilgisayar(1,"Bilgisayar1",0);
    Bilgisayar bilgisayarr2=new Bilgisayar(1,"Bilgisayar2",0);
    Kullanici berabere=new Kullanici(0,"berabere,",0);
    public void etkihesapla (List<Nesne> karsilastirma){
        if(karsilastirma.get(pc1listeindex).getIsim()=="TAS" && karsilastirma.get(pc2listeindex).getIsim()=="KAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1.25);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
           textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if(karsilastirma.get(pc1listeindex).getIsim()=="TAS" && karsilastirma.get(pc2listeindex).getIsim()=="MAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1.25);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="TAS" && karsilastirma.get(pc2listeindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-4);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="TAS" && karsilastirma.get(pc2listeindex).getIsim()=="USTAMAKAS" ){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2.5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2.5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="TAS" && karsilastirma.get(pc2listeindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2.5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-0.625);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }
        if(karsilastirma.get(pc1listeindex).getIsim()=="KAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="MAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1.25);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if(karsilastirma.get(pc1listeindex).getIsim()=="KAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="TAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1.25);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="KAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2.5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2.5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="KAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2.5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-0.625);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="KAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-4);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }

        if(karsilastirma.get(pc1listeindex).getIsim()=="MAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="TAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1.25);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if(karsilastirma.get(pc1listeindex).getIsim()=="MAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="KAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1.25);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="MAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2.5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-0.625);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="MAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-4);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="MAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2.5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2.5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="MAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2.5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2.5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="KAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-4);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="TAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-0.625);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2.5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1.25);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1.25);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="OZELKAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }


        if (karsilastirma.get(pc1listeindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="MAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-4);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="KAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-0.625);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2.5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="TAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2.5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2.5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1.25);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="USTAMAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1.25);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }

        //AGIRTAŞLA BAŞLAYAN 6 İF OLUCAK

        if (karsilastirma.get(pc1listeindex).getIsim()=="AGIRTAS" && karsilastirma.get(pc2listeindex).getIsim()=="MAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-0.625);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2.5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="AGIRTAS" && karsilastirma.get(pc2listeindex).getIsim()=="KAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2.5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-2.5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }

        if (karsilastirma.get(pc1listeindex).getIsim()=="AGIRTAS" && karsilastirma.get(pc2listeindex).getIsim()=="TAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-2);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-4);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="AGIRTAS" && karsilastirma.get(pc2listeindex).getIsim()=="AGIRTAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="AGIRTAS" && karsilastirma.get(pc2listeindex).getIsim()=="USTAMAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1.25);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-5);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if (karsilastirma.get(pc1listeindex).getIsim()=="AGIRTAS" && karsilastirma.get(pc2listeindex).getIsim()=="OZELKAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-5);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1.25);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));

        }

        if(karsilastirma.get(pc1listeindex).getIsim()=="TAS" && karsilastirma.get(pc2listeindex).getIsim()=="TAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if(karsilastirma.get(pc1listeindex).getIsim()=="KAGIT" && karsilastirma.get(pc2listeindex).getIsim()=="KAGIT"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }
        if(karsilastirma.get(pc1listeindex).getIsim()=="MAKAS" && karsilastirma.get(pc2listeindex).getIsim()=="MAKAS"){
            karsilastirma.get(pc1listeindex).setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik()-1);
            karsilastirma.get(pc2listeindex).setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik()-1);
            textField1.setText(String.valueOf(karsilastirma.get(pc1listeindex).getDayaniklilik()));
            textField2.setText(String.valueOf(karsilastirma.get(pc2listeindex).getDayaniklilik()));
        }

    }


    public void skorgoster(List<Nesne> karsilastirma){
        if ( karsilastirma.get(pc1listeindex).getDayaniklilik()==karsilastirma.get(pc2listeindex).getDayaniklilik()) {
            pc2seviye.setText(String.valueOf(karsilastirma.get(pc2listeindex).getSeviyePuani()));
            pc1seviye.setText(String.valueOf(karsilastirma.get(pc1listeindex).getSeviyePuani()));
            pc2topdayaniklilik=pc2topdayaniklilik+karsilastirma.get(pc2listeindex).getDayaniklilik();
            pc1topdayaniklilik=pc1topdayaniklilik+karsilastirma.get(pc1listeindex).getDayaniklilik();

        }
        else if (karsilastirma.get(pc1listeindex).getDayaniklilik()<karsilastirma.get(pc2listeindex).getDayaniklilik()) {
            pc2topdayaniklilik=pc2topdayaniklilik+karsilastirma.get(pc2listeindex).getDayaniklilik();
            pc1topdayaniklilik=pc1topdayaniklilik+karsilastirma.get(pc1listeindex).getDayaniklilik();
            karsilastirma.get(pc2listeindex).setSeviyePuani(karsilastirma.get(pc2listeindex).getSeviyePuani()+20);
            pc2seviye.setText(String.valueOf(karsilastirma.get(pc2listeindex).getSeviyePuani()));
            pc1seviye.setText(String.valueOf(karsilastirma.get(pc1listeindex).getSeviyePuani()));
            if(karsilastirma.get(pc2listeindex).getSeviyePuani()>30&& karsilastirma.get(pc2listeindex).getIsim()=="TAS") {
                if (karsilastirma.get(pc2listeindex).getSeviyePuani() == 40) {
                    AgirTas agirTas = new AgirTas();
                    for (Nesne gez : listComboboxpc2new) {
                        if (gez == karsilastirma.get(pc2listeindex)) {
                            agirTas.setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik());
                            agirTas.setSeviyePuani(karsilastirma.get(pc2listeindex).getSeviyePuani());
                            listComboboxpc2new.set(pc2donustur, agirTas);
                        }
                        pc2donustur++;
                    }
                    pc2donustur = 0;
                    JOptionPane.showMessageDialog(OYNAButton, "Bilgisayar2: Tas nesnesi AgirTas nesnesine donustu!");
                }
            }
            if(karsilastirma.get(pc2listeindex).getSeviyePuani()>30&& karsilastirma.get(pc2listeindex).getIsim()=="KAGIT"){
                if(karsilastirma.get(pc2listeindex).getSeviyePuani()==40){
                    OzelKagit ozelKagit=new OzelKagit();
                    for (Nesne gez:listComboboxpc2new) {
                        if(gez==karsilastirma.get(pc2listeindex)){
                            ozelKagit.setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik());
                            ozelKagit.setSeviyePuani(karsilastirma.get(pc2listeindex).getSeviyePuani());
                            listComboboxpc2new.set(pc2donustur,ozelKagit);
                        }
                        pc2donustur++;
                    }
                    pc2donustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,"Bilgisayar2: Kagit nesnesi OzelKagit nesnesine donustu!");
                }
            }



            if (karsilastirma.get(pc2listeindex).getSeviyePuani()>30&& karsilastirma.get(pc2listeindex).getIsim()=="MAKAS"){
                if(karsilastirma.get(pc2listeindex).getSeviyePuani()==40){
                UstaMakas ustaMakas=new UstaMakas();
                for (Nesne gez:listComboboxpc2new) {
                    if(gez==karsilastirma.get(pc2listeindex)){
                        ustaMakas.setDayaniklilik(karsilastirma.get(pc2listeindex).getDayaniklilik());
                        ustaMakas.setSeviyePuani(karsilastirma.get(pc2listeindex).getSeviyePuani());
                        listComboboxpc2new.set(pc2donustur,ustaMakas);
                    }
                    pc2donustur++;
                }
                pc2donustur=0;
                JOptionPane.showMessageDialog(OYNAButton,"Bilgisayar2: Makas nesnesi UstaMakas nesnesine donustu!");
                }
        }
            System.out.println("BİGİSAYAR2 COMBOBOX"+listComboboxpc2new);

        }
        else if (karsilastirma.get(pc1listeindex).getDayaniklilik()>karsilastirma.get(pc2listeindex).getDayaniklilik()) {
            pc2topdayaniklilik=pc2topdayaniklilik+karsilastirma.get(pc2listeindex).getDayaniklilik();
            pc1topdayaniklilik=pc1topdayaniklilik+karsilastirma.get(pc1listeindex).getDayaniklilik();
            karsilastirma.get(pc1listeindex).setSeviyePuani(karsilastirma.get(pc1listeindex).getSeviyePuani()+20);
            pc2seviye.setText(String.valueOf(karsilastirma.get(pc2listeindex).getSeviyePuani()));
            pc1seviye.setText(String.valueOf(karsilastirma.get(pc1listeindex).getSeviyePuani()));
            if(karsilastirma.get(pc1listeindex).getSeviyePuani()>30&& karsilastirma.get(pc1listeindex).getIsim()=="TAS"){
                if(karsilastirma.get(pc1listeindex).getSeviyePuani()==40){
                    AgirTas agirTask=new AgirTas();
                    for (Nesne gezk:listComboboxpc1new) {
                        if(gezk==karsilastirma.get(pc1listeindex)){
                            agirTask.setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik());
                            agirTask.setSeviyePuani(karsilastirma.get(pc1listeindex).getSeviyePuani());
                            listComboboxpc1new.set(pc1donustur,agirTask);
                        }
                        pc1donustur++;
                    }
                    pc1donustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,"Bilgisayar1: Tas nesnesi Agirtas nesnesine donustu!");
                }
            }
            if(karsilastirma.get(pc1listeindex).getSeviyePuani()>30&& karsilastirma.get(pc1listeindex).getIsim()=="KAGIT"){
                if(karsilastirma.get(pc1listeindex).getSeviyePuani()==40){
                    OzelKagit ozelKagitk=new OzelKagit();
                    for (Nesne gezk:listComboboxpc1new) {
                        if(gezk==karsilastirma.get(pc1listeindex)){
                           ozelKagitk.setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik());
                           ozelKagitk.setSeviyePuani(karsilastirma.get(pc1listeindex).getSeviyePuani());
                            listComboboxpc1new.set(pc1donustur,ozelKagitk);
                        }
                        pc1donustur++;
                    }
                    pc1donustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,"Bilgisayar1: Kagit nesnesi OzelKagit nesnesine donustu!");
                }
            }
            if(karsilastirma.get(pc1listeindex).getSeviyePuani()>30&& karsilastirma.get(pc1listeindex).getIsim()=="MAKAS"){
                if(karsilastirma.get(pc1listeindex).getSeviyePuani()==40){
                    UstaMakas ustaMakask=new UstaMakas();
                    for (Nesne gezk:listComboboxpc1new) {
                        if(gezk==karsilastirma.get(pc1listeindex)){
                            ustaMakask.setDayaniklilik(karsilastirma.get(pc1listeindex).getDayaniklilik());
                            ustaMakask.setSeviyePuani(karsilastirma.get(pc1listeindex).getSeviyePuani());
                            listComboboxpc1new.set(pc1donustur,ustaMakask);
                        }
                        pc1donustur++;
                    }
                    pc1donustur=0;
                    JOptionPane.showMessageDialog(OYNAButton,"Bilgisayar1: Makas nesnesi UstaMakas nesnesine donustu!");
                }
            }
            System.out.println("BİLGİSAYAR1 COMBOBOX"+listComboboxpc1new);

        }
        if(baslangichamlesi==hamlesayisi-1){
            sonucdayaniklilik.setText("Bilgisayar1 toplam dayaniklilik:"+pc1topdayaniklilik);
            sonucdurumlabel.setText("Bilgisayar2 toplam dayaniklilik: "+pc2topdayaniklilik);
            System.out.println("\nBilgisayar1 toplam dayaniklilik: "+pc1topdayaniklilik);
            System.out.println("Bilgisayar2 toplam dayaniklilik: "+pc2topdayaniklilik);
            if(pc1topdayaniklilik>pc2topdayaniklilik){
                oyunkazanani.setText("OYUN KAZANANİ : Bilgisayar1");
            }
            else if(pc2topdayaniklilik>pc1topdayaniklilik){
                oyunkazanani.setText("OYUNUN KAZANANİ : Bilgisayar2");
            }
            else{
                oyunkazanani.setText("OYUNUN KAZANANİ YOK , DURUM BERABERE");
            }
        }
    }

    public bilgisayarbilgisayar() {
        KALANHAMLETextField.setEnabled(false);
        pc1RandomNesneSecButton.setEnabled(false);
        pc2RandomNesneSecButton.setEnabled(false);
        pc1seviye.setEnabled(false);
        pc2seviye.setEnabled(false);
        pc1resim.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/pcbuyukresim.png")));
        pc2resim.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/pcbuyukresim.png")));
        textField2.setEnabled(false);
        textField1.setEnabled(false);
        OYNAButton.setEnabled(false);
        comboBoxpc1.setEnabled(false);
        comboBoxpc2.setEnabled(false);
        setContentPane(pcpcpanel);
        setTitle("bilgisayar-bilgisayar oyun ekrani");
        setSize(1500, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prolab prolab = new prolab();
                setVisible(false);
            }
        });


        OYNAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tas tass1=new Tas();
                Kagit kagitt1=new Kagit();
                Makas makass1=new Makas();
                AgirTas agirtas2=new AgirTas();
                OzelKagit ozelkagit2=new OzelKagit();
                UstaMakas ustamakas2=new UstaMakas();
                if (baslangichamlesi < hamlesayisi-1) {
                    if(indis!=-1){
                        comboBoxpc1.removeItemAt(indis);
                    }
                    if(randomuazalt!=0 && randomuazalt==5){
                        for (Nesne a:listComboboxpc1new) {
                            comboBoxpc1.addItem(a);
                            randomuazalt=0;
                        }
                    }

                    indis = (int) (Math.random() * (5-randomuazalt));
                    randomuazalt++;
                    comboBoxpc1.setSelectedIndex(indis);
                    if(comboBoxpc1.getSelectedItem().getClass().equals(tass1.getClass()))
                    { Tas taspc=(Tas) comboBoxpc1.getSelectedItem();
                        karsilastirma.add(pc1listeindex,taspc);
                        pc_pc_pc1button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/tas.png")));
                        bilgisayar1=0;

                    }
                    else if (comboBoxpc1.getSelectedItem().getClass().equals(kagitt1.getClass()))
                    {  Kagit kagitpc=(Kagit) comboBoxpc1.getSelectedItem();
                        karsilastirma.add(pc1listeindex,kagitpc);
                        pc_pc_pc1button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/kagit.png")));
                        bilgisayar1=1;
                    }
                    else if (comboBoxpc1.getSelectedItem().getClass().equals(makass1.getClass())) {
                        Makas makaspc=(Makas) comboBoxpc1.getSelectedItem();
                        karsilastirma.add(pc1listeindex,makaspc);
                        pc_pc_pc1button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/makas.png")));
                        bilgisayar1=2;
                    }
                    else if(comboBoxpc1.getSelectedItem().getClass().equals(agirtas2.getClass()))
                    {  AgirTas at2=(AgirTas) comboBoxpc1.getSelectedItem();
                        karsilastirma.add(pc1listeindex,at2);
                        pc_pc_pc1button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/agirtas.png")));
                    }
                    else if(comboBoxpc1.getSelectedItem().getClass().equals(ozelkagit2.getClass()))
                    {  OzelKagit ok2=(OzelKagit) comboBoxpc1.getSelectedItem();
                        karsilastirma.add(pc1listeindex,ok2);
                        pc_pc_pc1button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/ozelkagit.png")));
                    }
                    else if(comboBoxpc1.getSelectedItem().getClass().equals(ustamakas2.getClass()))
                    {  UstaMakas um2=(UstaMakas) comboBoxpc1.getSelectedItem();
                        karsilastirma.add(pc1listeindex,um2);
                        pc_pc_pc1button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/ustamakas.png")));
                    }


                    if(indis2!=-1){
                        comboBoxpc2.removeItemAt(indis2);
                    }
                    if(randomazalt2!=0 && randomazalt2==5){
                        for (Nesne b:listComboboxpc2new) {
                            comboBoxpc2.addItem(b);
                            randomazalt2=0;
                        }
                    }
                    Tas tass2=new Tas();
                    Kagit kagitt2=new Kagit();
                    Makas makass2=new Makas();
                    AgirTas agirtass1=new AgirTas();
                    OzelKagit ozelkagitt1=new OzelKagit();
                    UstaMakas ustamakass1=new UstaMakas();

                    indis2 = (int) (Math.random() *(5-randomazalt2));
                    randomazalt2++;
                    comboBoxpc2.setSelectedIndex(indis2);

                    if (comboBoxpc2.getSelectedItem().getClass().equals(tass2.getClass()))
                    {  Tas taspc2=(Tas) comboBoxpc2.getSelectedItem();
                        karsilastirma.add(pc2listeindex,taspc2);
                        pc_pc_pc2button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/tas.png")));
                        bilgisayar2=0;

                    }
                    else if (comboBoxpc2.getSelectedItem().getClass().equals(kagitt2.getClass()))
                    {  Kagit kagitpc2=(Kagit) comboBoxpc2.getSelectedItem();
                        karsilastirma.add(pc2listeindex,kagitpc2);
                        pc_pc_pc2button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/kagit.png")));
                        bilgisayar2=1;

                    }
                    else if (comboBoxpc2.getSelectedItem().getClass().equals(makass2.getClass())) {
                        Makas makaspc2=(Makas) comboBoxpc2.getSelectedItem();
                        karsilastirma.add(pc2listeindex,makaspc2);
                        pc_pc_pc2button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/makas.png")));
                        bilgisayar2=2;
                    }
                    else if(comboBoxpc2.getSelectedItem().getClass().equals(agirtas2.getClass()))
                    {  AgirTas att2=(AgirTas) comboBoxpc2.getSelectedItem();
                        karsilastirma.add(pc2listeindex,att2);
                        pc_pc_pc2button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/agirtas.png")));
                    }
                    else if(comboBoxpc2.getSelectedItem().getClass().equals(ozelkagit2.getClass()))
                    {  OzelKagit okk2=(OzelKagit) comboBoxpc2.getSelectedItem();
                        karsilastirma.add(pc2listeindex,okk2);
                        pc_pc_pc2button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/ozelkagit.png")));
                    }
                    else if(comboBoxpc2.getSelectedItem().getClass().equals(ustamakas2.getClass()))
                    {  UstaMakas umm2=(UstaMakas) comboBoxpc2.getSelectedItem();
                        karsilastirma.add(pc2listeindex,umm2);
                        pc_pc_pc2button.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/ustamakas.png")));
                    }

                    etkihesapla(karsilastirma);
                    skorgoster(karsilastirma);
                    pc1listeindex++;
                    pc2listeindex++;
                }
                else {
                    etkihesapla(karsilastirma);
                    skorgoster(karsilastirma);
                    OYNAButton.setEnabled(false);
                }
                baslangichamlesi++;
                KALANHAMLETextField.setText((String.valueOf(hamlesayisi-baslangichamlesi)));
            }

        });

        pc2RandomNesneSecButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(oynaac!=1){
                    OYNAButton.setEnabled(true);
                }
                oynaac++;
                for(int p=0;p<5;p++){
                    int random=(int)(Math.random()*3);
                    Bilgisayar bilgisayarr1=new Bilgisayar();
                    DefaultComboBoxModel<Nesne> defaultComboBoxModel=new DefaultComboBoxModel<Nesne>();
                    new DefaultComboBoxModel<Nesne>();
                    List<Nesne> listedetut=new ArrayList<>();
                    listedetut= bilgisayarr1.findall();
                    defaultComboBoxModel.addElement(listedetut.get(random));
                    listComboboxpc2new.add(p,listedetut.get(random));
                    comboBoxpc2.addItem(listedetut.get(random));
                    comboBoxpc2.setRenderer(new NesneListCellRenderer());
                    sinirpc2++;
                    if (sinirpc2==5){
                        pc2RandomNesneSecButton.setEnabled(false);
                        System.out.println("\nbilgisayar2 secimleri:");
                        for (Nesne b:listComboboxpc2new) {
                            System.out.println(b.getIsim());
                        }
                    }
                }

            }
        });

        pc1RandomNesneSecButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(oynaac!=1){
                    OYNAButton.setEnabled(true);
                }
                oynaac++;
                for(int p=0;p<5;p++){
                    int random=(int)(Math.random()*3);
                    Bilgisayar bilgisayarr2=new Bilgisayar();
                    DefaultComboBoxModel<Nesne> defaultComboBoxModel=new DefaultComboBoxModel<Nesne>();
                    new DefaultComboBoxModel<Nesne>();
                    List<Nesne> listedetut=new ArrayList<>();
                    listedetut= bilgisayarr2.findall();
                    defaultComboBoxModel.addElement(listedetut.get(random));
                    listComboboxpc1new.add(p,listedetut.get(random));
                    comboBoxpc1.addItem(listedetut.get(random));
                    comboBoxpc1.setRenderer(new NesneListCellRenderer());
                    sinirpc1++;
                    if (sinirpc1==5){
                        pc1RandomNesneSecButton.setEnabled(false);
                        System.out.println("bilgisayar1 secimleri");
                        for (Nesne a:listComboboxpc1new) {
                            System.out.println(a.getIsim());
                        }
                    }
                }

            }
        });
        hamleSayisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hamlesayisi= Integer.parseInt(hamlegir.getText());
                hamleSayisiButton.setEnabled(false);
                hamlegir.setEnabled(false);
                pc1RandomNesneSecButton.setEnabled(true);
                pc2RandomNesneSecButton.setEnabled(true);
                KALANHAMLETextField.setEnabled(true);
                KALANHAMLETextField.setText(String.valueOf(hamlesayisi));
                KALANHAMLETextField.setEnabled(false);
            }
        });
    }

    private class NesneListCellRenderer extends DefaultListCellRenderer{
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            if(value instanceof Nesne){
                Nesne nesne=(Nesne) value;
                //value=nesne.getIsim();

            }
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        }
    }




}
