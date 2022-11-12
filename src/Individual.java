import java.util.ArrayList;

public class Individual {
    private String email;
    private int points;
    private ArrayList<Individual> friends;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public ArrayList<Individual> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Individual> friends) {
        this.friends = friends;
    }

    public void earnPoint(int p) {
        points += p;
    }
}
