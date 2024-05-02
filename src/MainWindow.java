import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {

    JLabel qvestionLabel = new JLabel("Co Chcete dnes dělat");
    JButton learningButton = new JButton("učit se");
    JButton testingButton = new JButton("otestovat se");

    JButton codeTOAnswerButton = new JButton("poznat co kod dělá");
    JButton javaTheoryButton = new JButton("java teorie(příprava na maturitu)");
    JButton bouthButton = new JButton("oboje");
    public MainWindow() {


        qvestionLabel.setBounds(1000,250,250,50);
        qvestionLabel.setFont(new Font(null,Font.PLAIN,50));




        this.add(qvestionLabel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1920,1080);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon("logo.png");//to do no logo right now
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(6,107,147));



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
