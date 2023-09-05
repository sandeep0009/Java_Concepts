import java.util.*;
public class Hashmapp {
    public static void main(String[] args) {
        HashMap<String,Integer>language=new HashMap<>();
       //put() method add the elements 
       //hasmap basically store data in key pair but this is not synchornised and it implements the map interface
        language.put("java", 1);
        language.put("cpp",2);
        System.out.println(language);

        //get() method basically return the value at that place;
        int value=language.get("java");
        System.out.println(value);

        //replace() with key
        language.replace("java", 1, 3);
        System.out.println(language);

        
    }
    
}
