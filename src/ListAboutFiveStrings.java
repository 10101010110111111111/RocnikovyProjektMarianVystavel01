public class ListAboutFiveStrings {
    private String pictureName;
    private String rightAnswer;
    private String Answer2;
    private String Answer3;
    private String Answer4;

    public ListAboutFiveStrings(String pictureName, String rightAnswer, String answer2, String answer3, String answer4) {
        this.pictureName = pictureName;
        this.rightAnswer = rightAnswer;
        Answer2 = answer2;
        Answer3 = answer3;
        Answer4 = answer4;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getAnswer2() {
        return Answer2;
    }

    public void setAnswer2(String answer2) {
        Answer2 = answer2;
    }

    public String getAnswer3() {
        return Answer3;
    }

    public void setAnswer3(String answer3) {
        Answer3 = answer3;
    }

    public String getAnswer4() {
        return Answer4;
    }

    public void setAnswer4(String answer4) {
        Answer4 = answer4;
    }
}
