import java.util.ArrayList;

public class JavaTheory extends ListOFLists {

    private ArrayList<String> answers = new ArrayList<>();
    public JavaTheory(ArrayList<FiveStrings> list) {
        super(list);
    }
    public JavaTheory(){}

    @Override
    protected void addNewQvestion(String pictureName, String rightAnswer, String Answer2, String Answer3, String Answer4) {
        super.addNewQvestion(pictureName, rightAnswer, Answer2, Answer3, Answer4);
    }

    @Override
    protected void getListFromFile(String fileName) {
        fileName = "Theory.txt";
        super.getListFromFile(fileName);
    }

    @Override
    protected void makeFileFromList(String fileName) {
        super.makeFileFromList(fileName);
    }

    @Override
    public ArrayList<FiveStrings> getList() {
        return super.getList();
    }

    @Override
    public void setList(ArrayList<FiveStrings> list) {
        super.setList(list);
    }
}
