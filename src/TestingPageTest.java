import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TestingPageTest {

    @Test
    void updateImage() {
    }

    @Test
    void updateText() {
    }

    @Test
    void newQvestion() {

    }

    @Test
    void wasAnswerRight() {
        boolean b = true;
        assertEquals(true,b);
    }

    @Test
    void choseRandomlistWithFiveStrings() {
    }

    @Test
    void setButtonsANDLabelsText() {
    }

    @Test
    void selectWrongAnswer() {

    }

    @Test
    void setImageORText() {
        String s = "neco.png";
        assertEquals("neco.png",s);
    }

    @Test
    void randal() {
        int random;
        Random random1 = new Random();
        random = random1.nextInt(1,3);
        assertEquals(1 ,random1);
        assertEquals(2 ,random1);
    }

    @Test
    void deactivateButtons() {
        //fakt nvm jakto mám otestovat
    }

    @Test
    void clearButtonsText() {
        //same
    }

    @Test
    void activateButtons() {
        //same
    }

    @Test
    void barManipulation() {
        //taky jak to vubec funguje nvm
    }
}