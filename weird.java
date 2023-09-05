import java.util.Arrays;
public class weird {

    public static void main(String[] args) {
        int[] arr={1,4,2,6,3};
        count(arr);
        System.out.println(Arrays.toString(arr));

        
    }
  static void count(int[]arr)
  {

    for(int i =0;i<arr.length;i++)
    {
        int index=arr[i]-1;
        if(arr[i]!=arr[index])
        {
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            
        }
       
    }

  }
    


    
}
