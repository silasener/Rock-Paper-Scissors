import javax.swing.*;

public class Oyun {


    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

       SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                prolab prolabform=new prolab();
            }
        });

    }

}
