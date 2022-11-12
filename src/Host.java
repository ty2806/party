import java.util.ArrayList;

public class Host {
    private String email;
    private String location;
    private int points;
    private int space;
    private int price;

    private Filter filter;

    private ArrayList<Individual> guests;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFilter(ArrayList<Individual> friendList, int points, String emailSuffix)
    {
        filter = new Filter(friendList, points, emailSuffix);
    }

    public Filter getFilter()
    {
        return filter;
    }

    public boolean checkin(Individual individual)
    {
        if (individual.getEmail().equals(email)) {
            addGuest(individual);
            return true;
        }
        else {
            return false;
        }
    }

    public void assignPoints(Individual individual, int points)
    {
        individual.earnPoint(points);
    }

    public void addGuest(Individual individual)
    {
        guests.add(individual);
    }


}
