import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner item=new Scanner(System.in);
        int[] arr= new int[8];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=item.nextInt();
        }
        int key=7;
        Linear(arr,key);
        


    }


    static void Linear(int[] arr,int key)
    {
        if(arr.length==0)
        {
            System.out.println("-1");
        }
        for(int i=0;i<arr.length;i++)
        {
            int element=arr[i];
            if(element==key)
            {
                System.out.println(i);
                
            }
          
        }
    }
    
}
