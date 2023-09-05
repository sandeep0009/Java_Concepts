import java.util.ArrayList;
import java.util.List;

public class Combination {

    static void combinat(int ind,int[]arr,int target,List<List<Integer>>ans,List<Integer>ds)
    {
        if(ind==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target)
        {
            ds.add(arr[ind]);
            combinat(ind, arr, target, ans, ds);
        }
    }
    
}
