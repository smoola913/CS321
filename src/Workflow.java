//the workflow class handles the divorce 
public class Workflow{
    /* currentReport is the report for the workflow item*/
    DivorceReport currentReport;
    
    //This is the workflow object. The item consists of a divorce report,
    public WorkflowItem(DivorceReport report){
        currentReport = report;
        callReview(report);
        callApproval();
    }
    
    //
    DivorceReport getReport(){
        return currentReport;
    }
}