import java.util.Scanner;

public class RangeLinearSearch {
    public static void main(String[] args) {
        Scanner item=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=item.nextInt();

        }
        int key=34;
        System.out.println(Search(arr, 4, 10, key));
        
    }

    static boolean Search(int[] arr,int start,int end,int key)
    {
        for(int i =start;i<=end;i++)
        {
            if(arr[i]==key)
            {
                return true;
            }
        }
        return false;
    }
    
}
