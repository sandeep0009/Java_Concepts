public class TwoLinear {

    public static void main(String[] args) {
        int[][] arr={
            {2 ,3,4},
            {85,31,20},
            {1,2}
        };
        int target=90;
      System.out.println(  PresentOrNot(arr, target));

    }


    static boolean PresentOrNot(int[][]arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}
