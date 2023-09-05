import java.util.Arrays;
public class recursion3 {

    public static void main(String[] args) {
    
        
    }

    // static void reverse(int[] arr)
    // {
    //     int i=0;
    //     int j=arr.length-1;
    //     while(i<=j)
    //     {
    //         int temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;

    //     }

    //     for(i=0;i<arr.length;i++)
    //     {
    //         System.out.println(Arrays.toString(arr));
    //     }


    // }

    // recursion using two pointers.
    static void reverse(int l,int  r ,int[] arr)
    {
        l=0;
        r=arr.length-1;
        if(l>=r)
        {
            return;
        }
        swap(arr);
        
    }
    static int[] swap(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

        }
        return arr;

    }
    
}
