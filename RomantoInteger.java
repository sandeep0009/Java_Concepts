import javax.lang.model.util.ElementScanner14;

public class RomantoInteger {

    public static void main(String[] args) {
        String s="III";
        for(int i=0;i<s.length();i++)
        {
           int m= tocheck(s.charAt(i));
           m=m+0;

        }
        System.out.println(m);



        
    }

    static int tocheck(char symbol)
    {
        if(symbol=='I')
        {
            return 1;
        }
        else if(symbol=='V')
        {
            return 5;
        }
        else if(symbol=='X')
        {
            return 10;
        }
        else if(symbol=='L')
        {
            return 50;
        }
        else if(symbol=='C')
        {
            return 100;
        }
        else if(symbol=='D')
        {
            return 500;
        }
        else if (symbol=='M')
        {
            return 1000;
        }
        else{
            return -1;
        }
    }
    
}
