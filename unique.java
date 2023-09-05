public class unique {

    static void unique(int[]arr)
    {
        int res=0;
        int x=0;
        while(x<arr.length)
        {
            res^=arr[x];
            x++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        
        int[]arr={3,3,2,1,2,2,2};
        unique(arr);
    }
    
}
