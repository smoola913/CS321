package src;

public class DataEntry{
    String usersName;
    String spousesName;
    String action;

    //constructor - creates data entry
    public DataEntry(String usersName, String spousesName, String action) {
        setUsersName(usersName);
        setSpousesName(spousesName);
        setAction(action);
    }

    public String getUsersName() {
        return usersName;
    }

    public String getSpousesName() {
        return spousesName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public void setSpousesName(String spousesName) {
        this.spousesName = spousesName;
    }

    //this will open a gui
    void showDataEntryScreen(){
        //within the gui
        String n1 = "liz";
        String n2 = "jeff";
        DivorceReport dr = createDivorceReport(n1, n2);
        Workflow workflow = createWorkflowItem(dr);
    }

    DivorceReport createDivorceReport(String n1, String n2){
        DivorceReport dr = new DivorceReport(n1, n2);
        return dr;
    }

    Workflow createWorkflowItem(DivorceReport dr){
        Workflow wf = new Workflow(dr);
        return wf;
    }

    void nextStep(){ //calls next step in workflow and sends to review
        Review review = new Review();
    }
}