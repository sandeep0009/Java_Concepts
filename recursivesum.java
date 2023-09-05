public class recursivesum {


    public static void main(String[] args) {
        System.out.println(function(5));
        
    }

    static int function(int n)
    {
       if(n==0)
       {
        return 0;
       }
       return n+function(n-1);
    }
    
}
