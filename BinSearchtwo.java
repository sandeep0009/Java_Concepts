import java.util.Arrays;
public class BinSearchtwo {


    public static void main(String[] args) {
        int[][]arr={
            {1,2,3},
            {8,9,20},
            {25,40,45}
        };
        int target=45;
        System.out.println(Arrays.toString(BinSearch(arr, 45)));
        


    }
    static int[] BinSearch(int[][]arr,int target)
    {
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c>=0)
        {
            if(arr[r][c]==target)
            {
                return new int[]{r,c};
            }
             if(arr[r][c]<target)
            {
                r++;

            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};

    }
    
}
