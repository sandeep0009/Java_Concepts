public class EvenCount {

    public static void main(String[] args) {
        int[] arr={12,13,14,15,16};
       System.out.println( FindEven(arr));

        


    }

    static int FindEven(int[] arr)
    {
        int count=0 ,countt=0;
        for(int i =0;i<arr.length;i++)
        {
            int element=arr[i];
            while(element>0)
            {
               
                count++;
                element=element/10;

            }
            
            if(count%2==0)
            {
                countt++;
               
            }
            
        }

        return countt;
       
    }
    
}
