package src;

public class DataEntry{
    String usersName;
    String spousesName;
    
    //this will open a gui
    void showDataEntryScreen(){
        //within the gui
        String n1 = "liz";
        String n2 = "jeff";
        DivorceReport dr = createDivorceReport(n1, n2);
        Workflow wf = createWorkflowItem(dr);    
    }

    DivorceReport createDivorceReport(String n1, String n2){
        DivorceReport dr = new DivorceReport(n1, n2);
        return dr;
    }

    Workflow createWorkflowItem(DivorceReport dr){
        Workflow wf = new Workflow(dr);
        return wf;
    }
}