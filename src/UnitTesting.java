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
}

