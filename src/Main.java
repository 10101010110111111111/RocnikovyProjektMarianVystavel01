public class Main {
    public static void main(String[] args) {
        UserDatabase us = new UserDatabase();
        us.getListFromDocument();
        LunchPage page = new LunchPage(us);


    }
}