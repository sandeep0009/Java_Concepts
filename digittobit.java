import java.lang.Math;
public class digittobit {

    static void number(int n)
    {
        int ans=0;
        int r=10;
        int i=0;
       
        while(n!=0)
        {
            int bit=n & 1;
            ans= (bit*(int)(Math.pow(r, i)))+ans;
            n=n>>1;
            i++;

        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n=5;
        number(5);
    }
    
}
