package src;

public class Review {

    private String name;
    private int id;

    public Review(String name, int id) {
        name = this.name;
        id = this.id;
    }

    public Review() {

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
}