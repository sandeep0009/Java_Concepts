

public class BinSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,10,25,40};
        int key=400;
        
        System.out.println(BinSearc(arr, key));

        


    }

    static int BinSearc(int[] arr,int key)
    {
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;  //for big numbers if we dont do this then it will create out of range of array size
            if(key==arr[mid])
            {
                return mid;
            }
            else if(key<arr[mid])
            {
                mid=mid-1;
            }
            else{
                mid=mid+1;
            }
        }
        return -1;
    }
    
}
