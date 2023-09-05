import java.util.*;
public class Hasmap {
    public static void main(String[] args) {
        HashMap<String,Integer>countryMap=new HashMap<>();
        //insertion:
        countryMap.put("india",120);
        countryMap.put("us", 40);
        countryMap.put("china",150);
        // System.out.println(countryMap);

        // if(countryMap.containsKey("australia"))
        // System.out.println("key is present");

        for(Mappp.Entry<String,Integer>e:countryMap.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
    }
    
}
