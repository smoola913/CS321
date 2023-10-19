package src;

public class DivorceReport{
    
    String usersName;
    String spousesName;
    
    /* 
        The Divorce Report object.
    */
    public DivorceReport(String usersName, String spousesName){
        this.usersName = usersName;
        this.spousesName = spousesName;
    }

    String getUsersName(){
        return usersName;
    }

    String getSpousesName(){
        return spousesName;
    }
}