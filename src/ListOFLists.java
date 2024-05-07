import java.util.ArrayList;

public class ListOFLists {
    protected ArrayList<ListAboutFiveStrings> list = new ArrayList<>();

    public ListOFLists(ArrayList<ListAboutFiveStrings> list) {
        this.list = list;
    }

    public ArrayList<ListAboutFiveStrings> getList() {
        return list;
    }

    public void setList(ArrayList<ListAboutFiveStrings> list) {
        this.list = list;
    }
}
