import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int number= n.nextInt();
       int ne=0;
        while(number>0)
        {
            int rem=number%10;
            number=number/10;

             ne=ne*10+rem;
        }
        System.out.println(ne);



    }
    
}
