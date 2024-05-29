import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TestingPage implements ActionListener {


    private UserDatabase us;
    private int rightAnswers;


    private int buttonPressed;
    private int rightButton;
    private int lastRandom = Integer.MAX_VALUE;
    private UIBecouseINeedMoreClasses ui;
    private JFrame frame = new JFrame();
    private ImageIcon image = new ImageIcon();
    private JLabel label = new JLabel();
    private JButton but1 = new JButton("");
    private JButton but2 = new JButton();
    private JButton but3 = new JButton();
    private JButton but4 = new JButton();
    private JButton STARTBUTTON = new JButton();
    private Font font = new Font(null,Font.PLAIN,15);
    private Font font1 = new Font(null,Font.PLAIN,50);
    private JProgressBar bar = new JProgressBar();


    private TestingChoice choice;
    private boolean wantTest;
    private int _15answers;

    public TestingPage(UserDatabase us, boolean wantTest, TestingChoice choice) {
        ui = new UIBecouseINeedMoreClasses(frame,us,wantTest);
        this.choice = choice;
        this.wantTest = wantTest;
        _15answers = 0;


        this.us = us;
        label.setBounds(960 - 450,20,900,500);
        label.setVisible(true);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIcon(image);
        label.setFont(font1);
        label.setForeground(new Color(150,200,10));

        STARTBUTTON.setBounds(0,0,300,300);
        STARTBUTTON.setFocusable(false);
        STARTBUTTON.addActionListener(this);
        STARTBUTTON.setText("start");

        but1.setBounds(960-450,540,400,200);
        but1.setFocusable(false);
        but1.addActionListener(this);
        but1.setFont(font);

        but2.setBounds(960 + 50,540,400,200);
        but2.setFocusable(false);
        but2.addActionListener(this);
        but2.setFont(font);

        but3.setBounds(960 - 450,540 + 250,400,200);
        but3.setFocusable(false);
        but3.addActionListener(this);
        but3.setFont(font);

        but4.setBounds(960 + 50,540 + 250,400,200);
        but4.setFocusable(false);
        but4.addActionListener(this);
        but4.setFont(font);

        bar.setValue(0);
        bar.setBounds(960 + 450,300,200,50);
        bar.setStringPainted(true);
        bar.setFont(font);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setLayout(null);// tahle jedna věc ovlivňuje upně všechno tím že se nastaví na null tak se dá použít JLabel.bounds(x,x,x,x)

        ImageIcon icon = new ImageIcon("logo.png");//to do no logo right now
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(6,107,147));


        frame.add(but1);
        frame.add(but2);
        frame.add(but3);
        frame.add(but4);
        frame.add(label,BorderLayout.CENTER);
        frame.add(STARTBUTTON);
        frame.add(bar);



    }
    public void updateImage(String newImage){
        label.setText("");
        String imagePath = "Images/" + newImage;
        image.setImage(new ImageIcon(imagePath).getImage());
        label.setIcon(image);

    }
    public void updateText(String txt){
        label.setIcon(null);
        label.setText(txt);
    }
    public void newQvestion(String file){
        CodeToAnswer cTA  = new CodeToAnswer();
        cTA.getListFromFile(file);


        JavaTheory jT = new JavaTheory();
        jT.getListFromFile(file);

        if (choice == TestingChoice.CODE){
            setButtonsANDLabelsText(cTA);
        } else if (choice == TestingChoice.JAVATHEORY) {
            setButtonsANDLabelsText(jT);
        }else {
            switch (randal()){
                case 1 :
                    setButtonsANDLabelsText(cTA);
                    break;
                case 2 :
                    setButtonsANDLabelsText(jT);
                    break;
            }
        }
    }
    public boolean wasAnswerRight(){
        if (buttonPressed == rightButton){
            return true;
        }
            return false;

    }
    public FiveStrings choseRandomlistWithFiveStrings(ListOFLists lists){
        Random random = new Random();
        int specialCount = 0;
        do {
            int randomnes = random.nextInt(0,lists.getList().size());
            if (randomnes != lastRandom){
                lastRandom = randomnes;
                return lists.list.get(randomnes);
            }else {
                specialCount++;
            }

        }while (specialCount < 500);
        throw new RuntimeException("nemůžeme vybrat tu stejnou odpověď dvakrát");


    }
    public void setButtonsANDLabelsText(ListOFLists lists){
        Random random = new Random();
        rightButton = random.nextInt(1,5);


        FiveStrings strings = choseRandomlistWithFiveStrings(lists);
        setImageORText(strings.getPictureName());

        switch (rightButton){
            case 1 :
                but1.setText(strings.getRightAnswer());
                but2.setText(selectWrongAnswer(strings));
                but3.setText(selectWrongAnswer(strings));
                but4.setText(selectWrongAnswer(strings));
                break;
            case 2 :
                but1.setText(selectWrongAnswer(strings));
                but2.setText(strings.getRightAnswer());
                but3.setText(selectWrongAnswer(strings));
                but4.setText(selectWrongAnswer(strings));
                break;
            case 3 :
                but1.setText(selectWrongAnswer(strings));
                but2.setText(selectWrongAnswer(strings));
                but3.setText(strings.getRightAnswer());
                but4.setText(selectWrongAnswer(strings));
                break;
            case 4 :
                but1.setText(selectWrongAnswer(strings));
                but2.setText(selectWrongAnswer(strings));
                but3.setText(selectWrongAnswer(strings));
                but4.setText(strings.getRightAnswer());
                break;
        }



    }

    /**
     *
     * @param strings
     * @return
     */
    public String selectWrongAnswer(FiveStrings strings){
        boolean isEnd = false;
        Random random = new Random();
        String returned = "";
        do {

            int i = random.nextInt(1,4);

            switch (i){
                case 1 :
                    returned = strings.getAnswer2();
                    break;
                case 2 :
                    returned = strings.getAnswer3();
                    break;
                case 3 :
                    returned = strings.getAnswer4();
                    break;
            }
            if (!but1.getText().equals(returned) &&
                    !but2.getText().equals(returned) &&
                    !but3.getText().equals(returned) &&
                    !but4.getText().equals(returned)){

                isEnd = true;
            }
            if (but1.getText().equals("null") ||
                    but2.getText().equals("null") ||
                    but3.getText().equals("null") ||
                    but4.getText().equals("null")){
                isEnd = true;
            }
        }while (!isEnd);
        return returned;
    }
    public void setImageORText(String imageORText){
        String[] strings  = imageORText.split("\\.");
        if (strings.length > 1){
            updateImage(imageORText);
        }else {
            updateText(imageORText);
        }
    }

    public int randal(){
        Random random = new Random();
        return random.nextInt(1,3);
    }
    public void deactivateButtons(){
        but1.setEnabled(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        but4.setEnabled(false);
        STARTBUTTON.setEnabled(true);
    }
    public void clearButtonsText(){
        but1.setText("");
        but2.setText("");
        but3.setText("");
        but4.setText("");
    }
    public void activateButtons(){
        but1.setEnabled(true);
        but2.setEnabled(true);
        but3.setEnabled(true);
        but4.setEnabled(true);
        STARTBUTTON.setEnabled(false);
    }

    public void barManipulation(boolean wasAnswerRight){
        if (wasAnswerRight){
            _15answers++;
            bar.setValue(100 * _15answers / 15);
            if (bar.getValue() == 100){
                STARTBUTTON.setText("konec");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JavaTheory jt = new JavaTheory();
        jt.getListFromFile("d");
        if (e.getSource() == STARTBUTTON){
            if (STARTBUTTON.getText().equals("konec")){
                frame.dispose();
                SaveProgressPage sv = new SaveProgressPage(us,wantTest,choice);
            }else {
                newQvestion("nic.txt");
                STARTBUTTON.setText("další otázka");

                ui.deactivateLabels();
                activateButtons();
            }

        }
        if (e.getSource() == but1){
            buttonPressed = 1;

            deactivateButtons();
            ui.programRespand(wasAnswerRight());
            barManipulation(wasAnswerRight());
            clearButtonsText();
        }
        if (e.getSource() == but2){
            buttonPressed = 2;

            deactivateButtons();
            ui.programRespand(wasAnswerRight());
            barManipulation(wasAnswerRight());
            clearButtonsText();
        }
        if (e.getSource() == but3){
            buttonPressed = 3;

            deactivateButtons();
            ui.programRespand(wasAnswerRight());
            barManipulation(wasAnswerRight());
            clearButtonsText();
        }
        if (e.getSource() == but4){
            buttonPressed = 4;

            deactivateButtons();
            ui.programRespand(wasAnswerRight());
            barManipulation(wasAnswerRight());
            clearButtonsText();
        }
    }
}
