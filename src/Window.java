import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){
        this.setTitle("J@V@ T€@CH€R");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1080,720);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon("logo.png");//to do no logo right now
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(6,107,147));//https://www.csfieldguide.org.nz/en/interactives/rgb-mixer/
    }
}
