import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveProgressPage implements ActionListener {
    UserDatabase us;
    JFrame frame = new JFrame();
    JButton saveProgressButton = new JButton("uložit pokrok :)");
    JButton exitButton = new JButton("ukončit program");
    JButton nextTestButton = new JButton("spustit další cvičení");
    Font font = new Font(null,Font.PLAIN,35);
    private TestingChoice choice;
    private boolean wantTest;
    private JLabel XPLabel;

    /**
     * konstruktor který nastavuje základní hodnoty
     * @param userDatabase
     * @param wantTest
     * @param choice
     */
    public SaveProgressPage(UserDatabase userDatabase,boolean wantTest,TestingChoice choice) {

        this.us = userDatabase;
        this.choice = choice;
        this.wantTest = wantTest;

        JLabel qvestionLabel = new JLabel("Dokončil jsi cvičení co teď");
        qvestionLabel.setForeground(new Color(0,200,100));
        qvestionLabel.setBounds(480,130,1200,200);// tenhle shit nefunguje pokud v jFrejmu není vypnutý layout
        qvestionLabel.setFont(new Font(null,Font.BOLD,70));
        qvestionLabel.setHorizontalTextPosition(JLabel.CENTER);
        qvestionLabel.setVerticalTextPosition(JLabel.BOTTOM);// tohle je taky super nefunkčí používá se to jen v případě že je k tomu obrázek
        qvestionLabel.setVerticalAlignment(JLabel.TOP);// <--------------------------------tohle

        XPLabel = new JLabel("celkem XP: "+userDatabase.getActiveUser().getXP());
        XPLabel.setForeground(new Color(200,200,100));
        XPLabel.setBounds(1000,250,1200,200);// tenhle shit nefunguje pokud v jFrejmu není vypnutý layout
        XPLabel.setFont(new Font(null,Font.BOLD,70));
        XPLabel.setHorizontalTextPosition(JLabel.CENTER);
        XPLabel.setVerticalTextPosition(JLabel.BOTTOM);// tohle je taky super nefunkčí používá se to jen v případě že je k tomu obrázek
        XPLabel.setVerticalAlignment(JLabel.TOP);// <--------------------------------tohle







        // nastavení tlačítek


        saveProgressButton.setBounds(635,350,400,50);
        saveProgressButton.setFocusable(false);
        saveProgressButton.addActionListener(this);
        saveProgressButton.setFont(font);


        exitButton.setBounds(535-400,700,400,50);
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);
        exitButton.setFont(font);

        nextTestButton.setBounds(535+150,700,400,50);
        nextTestButton.setFocusable(false);
        nextTestButton.addActionListener(this);
        nextTestButton.setFont(font);





        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setLayout(null);// tahle jedna věc ovlivňuje upně všechno tím že se nastaví na null tak se dá použít JLabel.bounds(x,x,x,x)

        ImageIcon icon = new ImageIcon("logo.png");//to do no logo right now
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(88,107,147));





        // přidání tlačítek :)
        frame.add(saveProgressButton);
        frame.add(exitButton);
        frame.add(nextTestButton);

        frame.add(qvestionLabel);
        frame.add(XPLabel);





    }

    /**
     * reakce s tlačátky
     * @param e the event to be processed
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveProgressButton){
            us.createDocumentByLIst();
            saveProgressButton.setEnabled(false);
        }
        if (e.getSource() == exitButton){
            System.exit(0);
        }
        if (e.getSource() == nextTestButton){
            frame.dispose();
            TestingPage tp = new TestingPage(us,wantTest,choice);
        }


    }
}

