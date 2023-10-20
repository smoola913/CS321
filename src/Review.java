package src;

public class Review{
// review should be able to log issues and send them back
    private String name;
    private boolean maritalStatus;
    private int id;

    public Review(String name, boolean maritalStatus, int id) {
        this.name = name;
        this.maritalStatus = maritalStatus;
        this.id = id;
    }

    public Review(String name){
        this.name = name;
        this.id = 0;
    }

    public Review(){
        this.name = null;
        this.id = 0;
    }

    public String getName() {
        return name;

    }

    public int getID() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getMaritalStatus(){
        return maritalStatus;
    }

    //opens GUI
    void showReviewScreen(){
        String name1 = "Bobby";
        String name2 = "Charlotte";
        DataEntry dataEntry = new DataEntry(name1, name2, "Divorce");
        DivorceReport report = dataEntry.createDivorceReport(name1, name2);
    }


}