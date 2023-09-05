import java.util.Scanner;

public class Input {
    public static int sumation(int a,int b){
        return a+b;

    }
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.print(sumation(num1, num2));
        }
    
}
