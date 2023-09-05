public class MissingNumber {

    //0 to n;
    //[0,3,2]
    //missing here is 1

    public static void main(String[] args) {
        int[] arr={3,2,5,4,0};
        int m= missing(arr);
        System.out.println(m );
        
        
        

    }
    static int missing(int[]arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if( arr[i]<arr.length && arr[i]!=arr[correct])
            {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
        }
        return arr.length;
       
    }
}
