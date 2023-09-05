import java.util.Scanner;

public class StringLinearSearch {
    public static void main(String[] args) {
        Scanner item=new Scanner(System.in);
        String str=item.nextLine();
         Scanner key=new Scanner(System.in);
        char target=key.next().charAt(0);
          System.out.println(Search(str, target));
        
    }

    static boolean Search(String str, char target)
    {
        for(int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return true;

            }

        }
        return false;
    }
    
}
