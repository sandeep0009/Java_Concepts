import java.util.ArrayList;
import java.util.List;

public class DisappearNums {

    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1};
        //after sorting:
        // arrr={1,2,3,3,4,7,8}
         List<Integer>m=   missing(arr);
         System.out.println(m);


    }
    static List<Integer> missing(int[]arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int check=arr[i]-1;
            if(arr[i]!=arr[check])
            {
                int temp=arr[i];
                arr[i]=arr[check];
                arr[check]=temp;
            }
            else
            {
                i++;
            }

        }

        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
            {
                ans.add(j+1);
            }
        }
        return ans;
    }
    
}
