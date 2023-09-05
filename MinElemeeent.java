public class MinElemeeent {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,0};
        int m=FindMin(arr);
        System.out.println(m);
        
    }

    static int FindMin(int[]arr)
    {
        int min=arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
    
}
