public class User {
    private String name;
    private String password;
    private int XP;
    private int dayStreak;
    private int hoursSpend;
    private Boolean wasTrainingToday;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.XP = 0;
        this.dayStreak = 0;
        this.hoursSpend = 0;
        this.wasTrainingToday = false;
    }

    public User(String name, String password, int XP, int dayStreak, int hoursSpend, Boolean wasTrainingToday) {
        this.name = name;
        this.password = password;
        this.XP = XP;
        this.dayStreak = dayStreak;
        this.hoursSpend = hoursSpend;
        this.wasTrainingToday = wasTrainingToday;
    }

    //geters and setters
            public String getName() {
            return name;
        }

            public void setName(String name) {
            this.name = name;
        }

            public String getPassword() {
            return password;
        }

            public void setPassword(String password) {
            this.password = password;
        }

            public int getXP() {
            return XP;
        }

            public void setXP(int XP) {
            this.XP = XP;
        }

            public int getDayStreak() {
            return dayStreak;
        }

            public void setDayStreak(int dayStreak) {
            this.dayStreak = dayStreak;
        }

            public int getHoursSpend() {
            return hoursSpend;
        }

            public void setHoursSpend(int hoursSpend) {
            this.hoursSpend = hoursSpend;
        }

            public Boolean getWasTrainingToday() {
            return wasTrainingToday;
        }

            public void setWasTrainingToday(Boolean wasTrainingToday) {
            this.wasTrainingToday = wasTrainingToday;
        }

}
