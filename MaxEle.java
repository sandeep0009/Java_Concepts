public class MaxEle {

    public static void main(String[] args) {
        int [] arr={1,2,45,90,34};
        int m=FinMax(arr);
        System.out.println(m);

        

    }

    static int FinMax(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }


        }
        return max;
    }
    
}
