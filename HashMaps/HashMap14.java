import java.util.Map;

public class HashMap14 {
    Map<String , Integer> map ; 
    int interval = 10 ; 

    public HashMap14(){ 
        map = new HashMap<>(); 
    }

    public boolean shouldPrintMessage( int timestanp , string message){ 
        if(!map.containsKey(message)){ 
            map.put(message,timestanp);
            return true ; 
        }
        int existingTimestamp = map.get(message); 
        if(timestanp >= existingTimestamp + interval ){
        map.put(message,timestanp);
        return true ; 
    }
    return false ; 
}
}

