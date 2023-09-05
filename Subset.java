import java.util.ArrayList;
public class Subset{

    static void printf(ArrayList<Integer>arr,int[]a,int index,int n)
    {
        if(index==n)
        {
            System.out.println(arr);
            return;
        }
        arr.add(a[index]);
        printf(arr, a, index+1, n);
        arr.remove(a[index]);
        printf(arr, a, index+1, n);
        

        
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        int[]ar={1,2,3};
        int n=3;
        printf(arr, ar, 0,n); 
        

    }
}