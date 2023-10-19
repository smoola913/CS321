public class DataEntry{
    String usersName;
    String spousesName;

    //this will open a gui
    void showDataEntryScreen(){
        //within the gui
        String n1;
        String n2;
        createDivorceReport(n1, n2);       
    }
    
    WorkflowItem addWorkflowItem(DivorceReport report){
        WorkflowItem
    }

    DivorceReport createDivorceReport(String n1, String n2){
        DivorceReport newDivorce = new DivorceReport(n1, n2);
        return newDivorce;
    }

}