import java.util.*;

class bits2{

    public static void Swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("swapped values of a is "+a +"swapped value of b is"+b);
    }
    public static void main(String[]args){

        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        Swap(a, b);

    }
}