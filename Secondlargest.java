import java.util.Scanner;

public class Secondlargest {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        int n=st.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=st.nextInt();
        }
        int largest=arr[n-1];
        int second=0;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                second=arr[i];
                break;
            }
        }
      System.out.println(second);
    
    }
    
}
