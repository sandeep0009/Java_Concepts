import java.util.Scanner;

public class Input2 {
    public static String reverse(String s){
        StringBuilder reverse=new StringBuilder();
       for(int i=s.length()-1;i>=0;i--){
        reverse.append(s.charAt(i));
       }
       return reverse.toString();
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String s= input.nextLine();
        System.out.print(reverse(s));

    }
}
