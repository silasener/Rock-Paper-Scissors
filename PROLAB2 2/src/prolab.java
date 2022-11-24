import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prolab extends JFrame {
    private JPanel mainpanel;
    private JTextField kullaniciBilgisayarTextField;
    private JTextField bilgisayarBilgisayarTextField;
    private JButton kullanicipcbutton;
    private JButton pcpcbutton;
    private JButton tkmresimbutton;
    private JButton pcresimbutton;
    private JButton pc2resimbutton;
    private JButton pc1resimbutton;
    private JButton kullaniciresimbutton;

    private JPanel skorekrani;

    public prolab(){
        setContentPane(mainpanel);
        setTitle("secim menusu");
        setSize(1500,800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
      kullaniciresimbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/kullanicibuyuk.png")));
        pcresimbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/pcbuyukresim.png")));
        pc1resimbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/pcbuyukresim.png")));
        pc2resimbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/pcbuyukresim.png")));
        tkmresimbutton.setIcon(new ImageIcon(getClass().getResource("taskagitmakas_resim/tkm.png")));


        kullanicipcbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

          kullanicibilgisayar kullanicibilgisayar=new kullanicibilgisayar();
              setVisible(false);
            }
        });


        pcpcbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bilgisayarbilgisayar bilgisayarbilgisayar=new bilgisayarbilgisayar();
          setVisible(false);
            }
        });
    }
}
