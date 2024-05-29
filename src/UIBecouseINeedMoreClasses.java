import javax.swing.*;
import java.awt.*;

public class UIBecouseINeedMoreClasses {
    private int XPgain;
    private UserDatabase us = new UserDatabase();
    private boolean isTesting;
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private Font font = new Font(null,Font.PLAIN,40);

    /**
     * taky konstruktor
     * @param frame
     * @param us
     * @param testujeSe
     */

    public UIBecouseINeedMoreClasses(JFrame frame,UserDatabase us,boolean testujeSe) {
        this.us = us;
        this.isTesting = testujeSe;
        XPgain = 0;
        jLabel1.setBounds(960-500,540-150,300,100);
        jLabel1.setVisible(true);
        jLabel1.setForeground(Color.red);
        jLabel1.setFont(font);


        jLabel2.setBounds(960+400,540-150,300,100);
        jLabel2.setVisible(true);
        jLabel2.setForeground(Color.green);
        jLabel2.setFont(font);

        frame.add(jLabel1);
        frame.add(jLabel2);
        frame.setLayout(null);

    }

    /**
     * tohle přidáva nebo odebírá XP
     * @param tORf
     */
    public void programRespand(boolean tORf){
        if (tORf){
            if (isTesting){
                XPgain += 3;
                jLabel2.setText("Správně \n +" + XPgain + "XP");
                jLabel2.setVisible(true);
                us.getActiveUser().setXP(us.getActiveUser().getXP() + XPgain);
                XPgain = 0;
            }else {
                XPgain += 1;
                jLabel2.setText("Správně \n +" + XPgain + "XP");
                jLabel2.setVisible(true);
                us.getActiveUser().setXP(us.getActiveUser().getXP() + XPgain);
                XPgain = 0;
            }

        }else {
            if (isTesting){
                XPgain -= 200;
                jLabel1.setText("Špatně \n " + XPgain + "XP");
                jLabel1.setVisible(true);
                us.getActiveUser().setXP(us.getActiveUser().getXP() + XPgain);
                XPgain = 0;
                us.createDocumentByLIst();

            }else {
                jLabel1.setText("Špatně \n " + XPgain + "XP");
                jLabel1.setVisible(true);
                XPgain = 0;
            }

        }
    }

    /**
     * tohle maže text aby tam nebyl při další otázce
     */
    public void deactivateLabels(){
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
    }

}
