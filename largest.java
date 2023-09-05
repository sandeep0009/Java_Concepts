import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
        
        Scanner st= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=st.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=st.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    
    }



}