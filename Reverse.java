import java.util.Scanner;

public class Reverse {

    static void reverse(int n)
    {
        int ans=0;
        while(n!=0)
        {
            int rem=n%10;
            if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)
            {
                return;
            }
            ans=ans*10+rem;
            n=n/10;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
      int n=1534236469;
      reverse(n);

    }
    
    
}
