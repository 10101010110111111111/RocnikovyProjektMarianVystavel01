import java.io.*;
import java.util.ArrayList;

public class ListOFLists {
    protected ArrayList<FiveStrings> list = new ArrayList<>();

    public ListOFLists(ArrayList<FiveStrings> list) {
        this.list = list;
    }

    public ListOFLists() {

    }

    protected void addNewQvestion(String pictureName,String rightAnswer,String Answer2,String Answer3,String Answer4){
        list.add(new FiveStrings(pictureName,rightAnswer,Answer2,Answer3,Answer4));
    }
    protected void getListFromFile(String fileName){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String manipulatedString = "";
            while ((manipulatedString = br.readLine()) != null){
                String[] strings = manipulatedString.split(",");

                list.add(new FiveStrings(strings[0],strings[1],strings[2],
                        strings[3],strings[4]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    protected void makeFileFromList(String fileName){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            String returnedString = "";
            for (int i = 0;i< list.size();i++){//for each první a poslední
                returnedString += list.get(i).getPictureName();
                returnedString += ",";
                returnedString += list.get(i).getRightAnswer();
                returnedString += ",";
                returnedString += list.get(i).getAnswer2();
                returnedString += ",";
                returnedString += list.get(i).getAnswer3();
                returnedString += ",";
                returnedString += list.get(i).getAnswer4();
                returnedString += "\n";

            }
            bw.write(returnedString);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




    public ArrayList<FiveStrings> getList() {
        return list;
    }

    public void setList(ArrayList<FiveStrings> list) {
        this.list = list;
    }
}
