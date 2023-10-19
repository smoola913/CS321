package src;

//the workflowitem class handles the divorce
public class Workflow{
    /* currentReport is the report for the workflow item*/
    DivorceReport currentReport;
    
    //This is the workflow item object. The item consists of a divorce report,
    public Workflow(DivorceReport report){
        currentReport = report;
    }
    //get the report accociated with the current workflow item.
    DivorceReport getReport(){
        return currentReport;
    }
}