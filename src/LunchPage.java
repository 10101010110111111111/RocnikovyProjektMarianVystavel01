import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LunchPage implements ActionListener {
    UserDatabase us;

    JFrame frame = new JFrame();
    JButton logInButton = new JButton("LogIN");
    JButton registerButton = new JButton("Register");

    JTextField textField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    Font font = new Font(null,Font.PLAIN,35);
    Color redColor = new Color(255,0,0);
    JLabel mesageLabel = new JLabel();



    public LunchPage(UserDatabase us){
        this.us = us;


        //seting up the logIn Button
        {
            logInButton.setBounds(835,600,250,50);
            logInButton.setFocusable(false);// aby ty tlačítka nebyly zvírazněné
            logInButton.addActionListener(this);
            logInButton.setFont(font);
        }
        //seting up the register Button
        {
            registerButton.setBounds(835,650,250,50);
            registerButton.setFocusable(false);// aby ty tlačítka nebyly zvírazněné
            registerButton.addActionListener(this);
            registerButton.setFont(font);

        }
        //seting up textField


            textField.setBounds(835,400,250,50);
            JLabel labelForTextField = new JLabel("Jméno:");
            labelForTextField.setBounds(710,400,250,50);
            labelForTextField.setFont(font);

        //seting up passwordField


            passwordField.setBounds(835,460,250,50);

            JLabel labelForPassWordField = new JLabel("Heslo:");
            labelForPassWordField.setBounds(710,460,250,50);
            labelForPassWordField.setFont(font);
        // setting up messageLabel

            
            mesageLabel.setBounds(800,700,250,50);
            mesageLabel.setFont(new Font(null,Font.ITALIC,40));



            //seting up the first window
        {
            frame.setTitle("J@V@ T€@CH€R");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setSize(1920,1080);
            frame.setVisible(true);


            ImageIcon icon = new ImageIcon("logo.png");//to do no logo right now
            frame.setIconImage(icon.getImage());
            frame.getContentPane().setBackground(new Color(6,107,147));//https://www.csfieldguide.org.nz/en/interactives/rgb-mixer/

        }

        // adding buttons and other staf
        frame.add(logInButton);
        frame.add(registerButton);
        frame.add(textField);
        frame.add(labelForTextField);
        frame.add(passwordField);
        frame.add(labelForPassWordField);
        frame.add(mesageLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {



        if (e.getSource() == logInButton){
            String s1 = textField.getText();
            String s2 = String.valueOf(passwordField.getPassword());


            if (us.LogIN(s1,s2)){
                frame.dispose();
                MainWindow mainWindow = new MainWindow();
            }else {
                passwordField.setText("");
                mesageLabel.setForeground(redColor);
                mesageLabel.setText("špátné heslo nebo něco jiného");

            }
        }




        if (e.getSource() == registerButton){
            String s1 = textField.getText();
            String s2 = String.valueOf(passwordField.getPassword());


            if (us.register(s1,s2)){
                frame.dispose();
                MainWindow mainWindow = new MainWindow();
            }else {

                textField.setText("");
                passwordField.setText("");

                mesageLabel.setForeground(redColor);
                mesageLabel.setText("tohle jméno už je zabrané");
            }
        }
    }

}
