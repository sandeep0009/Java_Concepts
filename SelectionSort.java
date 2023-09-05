public class SelectionSort {

    public static void main(String[] args) {
        

    }

    static void selection(int[] arr)
    {
        int last=arr.length-i-1;
        int maxINdex=getMaxIndex(arr,start,last);
    
       

    }
    static void getMaxIndex(int[]arr ,int start,int last){
        int max=start;
        for(int i=start;i<=last;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
    }
    
}
