import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr={5,3,4,6,1,2};
        insert(arr);
        System.out.println(Arrays.toString(arr));
        


    }

    static void insert(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
    }
    
}
