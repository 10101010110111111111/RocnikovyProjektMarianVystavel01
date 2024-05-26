import java.io.*;
import java.util.ArrayList;

public class UserDatabase {
    private ArrayList<User> listOFUsers = new ArrayList<>();
    private User activeUser;

    public void getListFromDocument(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("DocumentOFUsers.txt"));
            String manipulatedString = "";
            while ((manipulatedString = br.readLine()) != null){
                String[] strings = manipulatedString.split(",");
                
                listOFUsers.add(new User(strings[0],strings[1],Integer.parseInt(strings[2]),
                        Integer.parseInt(strings[3]),Integer.parseInt(strings[4]),
                        Boolean.parseBoolean(strings[5])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void createDocumentByLIst(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("DocumentOFUsers.txt"));
            String returnedString = "";
            for (User u : listOFUsers){//for each první a poslední
                returnedString += u.getName();
                returnedString += ",";
                returnedString += u.getPassword();
                returnedString += ",";
                returnedString += u.getXP();
                returnedString += ",";
                returnedString += u.getDayStreak();
                returnedString += ",";
                returnedString += u.getHoursSpend();
                returnedString += ",";
                returnedString += u.getWasTrainingToday();
                returnedString += "\n";
                /*
                tento způsob nemusí být vždy OK
                bw.write(u.getName());bw.write(",");
                bw.write(u.getPassword());bw.write(",");
                bw.write(u.getDayStreak());bw.write(",");
                bw.write(u.getXP());bw.write(",");
                bw.write(u.getHoursSpend());bw.write(",");
                bw.newLine();
                 */
            }
            bw.write(returnedString);// lepší způsob
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean register(String name,String password){
        boolean isPosible = true;
        if (name.length() < 1){
            isPosible = false;
            return isPosible;
        }
        for (User u : listOFUsers){
            if (u.getName().equals(name)){
                isPosible = false;
                return isPosible;
            }
        }
        listOFUsers.add(new User(name,password));
        activeUser = listOFUsers.get(listOFUsers.size()-1);
        this.createDocumentByLIst();
        return isPosible;

    }
    public boolean LogIN(String name,String password){
        User potencionalUser;
        for (User u : listOFUsers){
            potencionalUser = u;
            if (u.getName().equals(name)){
                if (potencionalUser.getPassword().equals(password)){
                    activeUser = potencionalUser;
                    return true;
                }
            }
        }

        return false;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }
}
