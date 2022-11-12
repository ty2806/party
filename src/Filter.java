import java.util.ArrayList;

public class Filter {
    private ArrayList<Individual> friendsList;
    private int points;
    private String emailSuffix;

    public Filter(ArrayList<Individual> friendsList, int points, String emailSuffix) {
        this.friendsList = friendsList;
        this.points = points;
        this.emailSuffix = emailSuffix;
    }

    public ArrayList<Individual> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(ArrayList<Individual> friendsList) {
        this.friendsList = friendsList;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getEmailSuffix() {
        return emailSuffix;
    }

    public void setEmailSuffix(String emailSuffix) {
        this.emailSuffix = emailSuffix;
    }
}
