public class DuplicateNumber {

    public static void main(String[] args) {
        int [] arr={1,3,4,2,2};
        int m=duplicate(arr);
        System.out.println(m);
    }

    static int duplicate(int[]arr)
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
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(j!=arr[j]-1)
            {
                return arr[j];
            }
        }
        return -1;
    }
    
}
