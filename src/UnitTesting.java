package src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTesting {
    
    @Test
    void DivorceReportTest(){
        
        DivorceReport dr = new DivorceReport("Mary", "John");

        assertEquals("John", dr.getUsersName());
        assertEquals("Mary", dr.getUsersName());
        assertEquals("John", dr.getSpousesName());
        assertEquals("Mary", dr.getSpousesName());
    }

    @Test
    void DataEntry(){
        showDataEntryScreen();
        DivorceReport dr = new DivorceReport("liz", "jeff");
        WorkflowItem wf = new WorkflowItem(dr);  
        assertEquals(dr, createDivorceReport("liz", "jeff"));
        assertEquals(wf, createWorkflowItem(dr));
    }
}

