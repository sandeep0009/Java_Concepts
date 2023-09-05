import java.util.Arrays;
public class CyclicSort {

    //when given no from range (1,n) =>use cyclic sort
        //         [3,5,2,1,4]
        // aftersorting it become =>[1,2,3,4,5]
        // index=value-1
        // start from beginning
        //check where it should lie at correct index
        //then directly swap it with correct index
        public static void main(String[] args) {
            int[] arr={3,5,2,1};
            count(arr);
            System.out.println(Arrays.toString(arr));
            

        }

        static void count(int[] arr)
        {
            int i=0;
            while(i<arr.length)
            {
                int correct=arr[i]-1;//number at index
                if(arr[i]<arr.length && arr[i]!=arr[correct])//check if index element not equal to index
                {
                    int temp=arr[i];
                    arr[i]=arr[correct];
                    arr[correct]=temp;
                }
                else
                {
                    i++;
                }
            }

            int j;

            for(j=0;j<arr.length;j++)
            {
                if(arr[j]!=j)
                {
                    System.out.println(j);
                }

            }
            System.out.println(arr.length);
          
               
            
        }

    
}
