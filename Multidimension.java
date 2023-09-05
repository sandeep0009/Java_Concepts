import java.util.Scanner;
import java.util.Arrays;

public class Multidimension {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
       
    //    in heap section it is stored in array of smaller array  thats why its not necessary to give colimn a value but mandatory to give row a value.
        // int[][] ar={
        //     {1,2,34},
        //     {4,5,6},
        //     {7,8,5}
        // };

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[i].length;j++)
        //     {
        //        System.out.println( arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        
        // single line for loop
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        // advance for loop
        for(int[] a:arr)
        {
            System.out.println(Arrays.toString(a));
        }


    }
    
}
