import java.util.*;
public class Input3 {
    public static String EvenOdd(int a){
        if(a%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[]args){
        Scanner n=new Scanner(System.in);
        int num=n.nextInt();
        System.out.print(EvenOdd(num));
    }
}
