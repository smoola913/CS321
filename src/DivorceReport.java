package src;

public class DivorceReport{
    /* 
        The Divorce Report object.
        This object will have certain fieds that will be populated. 
        Having never reported a divorce before, some of the required fields may include:
    */
   
    String usersName;
    String spousesName;
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