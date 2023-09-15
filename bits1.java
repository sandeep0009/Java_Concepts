
import java.util.*;
import java.util.Scanner;

class bits{

    public static  boolean oddEven(int a){

        if((a&1)==0)return true;
        return false;
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();

        System.out.println(oddEven(a));

    }
}