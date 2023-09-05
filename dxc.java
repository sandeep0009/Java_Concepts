import java.util.*;
class dxc{
    // public void solution(int[]arr ,int n){
    //     int[]ar=new int[n];
    //     int[]ar2=new int[n]
    //     for(int i=0;i<n;i++){
    //         if(arr[i]%2==0){
    //             ar[i]=arr[i];
    //         }
    //         else{
    //             ar2[i]==arr[i];
    //         }
    //     }
    // }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }

    }
}