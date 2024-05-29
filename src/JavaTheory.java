import java.util.ArrayList;

public class JavaTheory extends ListOFLists {

    private ArrayList<String> answers = new ArrayList<>();
    public JavaTheory(ArrayList<FiveStrings> list) {
        super(list);
    }

    /**
     * konstruktor
     */
    public JavaTheory(){}

    /**
     * vytvoří novou otázku pomocí kodu ze třída ListOFLists
     * @param pictureName
     * @param rightAnswer
     * @param Answer2
     * @param Answer3
     * @param Answer4
     */

    @Override
    protected void addNewQvestion(String pictureName, String rightAnswer, String Answer2, String Answer3, String Answer4) {
        super.addNewQvestion(pictureName, rightAnswer, Answer2, Answer3, Answer4);
    }

    /**
     * používaá metodu z ListOFLists ale jmeno souboru je Theory.txt
     * @param fileName
     */
    @Override
    protected void getListFromFile(String fileName) {
        fileName = "Theory.txt";
        super.getListFromFile(fileName);
    }

    /**
     * upně stejné jako v ListOFLists
     * @param fileName
     */
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
