import java.util.HashSet;
import java.util.Iterator;
public class hashset {

    // insert ,search and delete=o(1)
    public static void main(String[] args) {
        
        HashSet<Integer>set= new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(3);
        // System.out.println(set); 
        // if(set.contains(1))
        // {
        //     System.out.println("set contain");
        // }
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


       
    }

    
}
