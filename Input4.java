import java.util.Scanner;

public class Input4 {
    public static int Negative(int a){
        int sum=0;
        while(true){
            if(a<0){
                break;

            }
            if(a>=0){
                sum++;
            }
        }
        return sum;

    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        System.out.print(Negative(a));
    }
    
}
