import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {

    public static void main(String[] args) {
        
        //array list is basically an array which is like a vector in cpp where it can be used when we dont know the size of array
        // if the first list is filled then it will double the size and also keep on increasing doubling the list till all the elements are not filled and old list will be deleted
        
        //syntax:
        ArrayList<Integer> list= new ArrayList<>();
        Scanner in=new Scanner(System.in);
        for(int i =0;i<9;i++)
        {
            list.add(in.nextInt());
        }
        for(int i =0;i<9;i++)
        {
            System.out.println(list.get(9));
        }

     
    }
    
}
