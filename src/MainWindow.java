import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow  implements ActionListener {

    UserDatabase us;
    JFrame frame = new JFrame();
    JButton learningButton = new JButton("učit se");
    JButton testingButton = new JButton("otestovat se");

    JButton codeTOAnswerButton = new JButton("poznat co kod dělá");
    JButton javaTheoryButton = new JButton("java teorie(příprava na maturitu)");
    JButton bouthButton = new JButton("oboje");
    JButton startButton = new JButton("spustit");
    Font font = new Font(null,Font.PLAIN,35);
    public MainWindow(UserDatabase userDatabase) {

        this.us = userDatabase;

        JLabel qvestionLabel = new JLabel("Co Chcete dnes dělat?");
        qvestionLabel.setForeground(new Color(0,200,100));
        qvestionLabel.setBounds(580,130,800,200);// tenhle shit nefunguje pokud v jFrejmu není vypnutý layout
        qvestionLabel.setFont(new Font(null,Font.BOLD,70));
        qvestionLabel.setHorizontalTextPosition(JLabel.CENTER);
        qvestionLabel.setVerticalTextPosition(JLabel.BOTTOM);// tohle je taky super nefunkčí používá se to jen v případě že je k tomu obrázek
        qvestionLabel.setVerticalAlignment(JLabel.TOP);// <--------------------------------tohle







        // nastavení tlačítek


                learningButton.setBounds(635,350,250,50);
                learningButton.setFocusable(false);
                learningButton.addActionListener(this);
                learningButton.setFont(font);

                testingButton.setBounds(535+400,350,250,50);
                testingButton.setFocusable(false);
                testingButton.addActionListener(this);
                testingButton.setFont(font);

                codeTOAnswerButton.setBounds(200,640,350,60);
                codeTOAnswerButton.setFocusable(false);
                codeTOAnswerButton.addActionListener(this);
                codeTOAnswerButton.setFont(font);

                javaTheoryButton.setBounds(635,640,600,60);
                javaTheoryButton.setFocusable(false);
                javaTheoryButton.addActionListener(this);
                javaTheoryButton.setFont(font);

                bouthButton.setBounds(1300,640,250,60);
                bouthButton.setFocusable(false);
                bouthButton.addActionListener(this);
                bouthButton.setFont(font);

                startButton.setBounds(835,840,250,50);//hotovo
                startButton.setFocusable(false);
                startButton.addActionListener(this);
                startButton.setFont(font);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setLayout(null);// tahle jedna věc ovlivňuje upně všechno tím že se nastaví na null tak se dá použít JLabel.bounds(x,x,x,x)

        ImageIcon icon = new ImageIcon("logo.png");//to do no logo right now
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(6,107,147));





        // přidání tlačítek :)
        frame.add(learningButton);
        frame.add(testingButton);
        frame.add(codeTOAnswerButton);
        frame.add(javaTheoryButton);
        frame.add(bouthButton);
        frame.add(startButton);
        frame.add(qvestionLabel);





    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
