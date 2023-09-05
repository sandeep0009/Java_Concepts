import java.util.*;
import java.util.Arrays;
public class Accenture{
    public static int function(int[]arr,int n)
    {
        int[]even=new int[arr.length];
        int[]odd=new int[arr.length];
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even[i]=arr[i];
            }
            else{
                odd[i]=arr[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        return even[n-2]+odd[n-2];
    }

    public static void main(String[]args)
    {
        int[]arr={3, 2, 1, 7, 5, 4};
        int n=arr.length;
        System.out.print(function(arr,n));
    }
}