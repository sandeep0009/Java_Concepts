public class compliment {

    static void comp(int n)
    {
        int digit=0;
        int i=0;
        while(n!=0)
        {
            int bit=n &1;
            digit=(bit*(int)Math.pow(10,i))+digit;
            n=n>>1;
            
        }
        
    }
    
}
