import java.util.Arrays;
public class Alternateswap {

 static void alternate(int[]arr)
 {
    for(int i=0;i<arr.length-1;i+=2)
    {
        if(i+1<arr.length)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }

    System.out.println(Arrays.toString(arr));
 }

 public static void main(String[] args) {
    int[]arr={1,2,3,4,5};
    alternate(arr);
 }
    
}
