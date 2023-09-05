class A{
    int a;
    public void method2(){
        System.out.println("im a mehtod for class a");
    }
}

class B extends A{
    @Override
    public void method2(){
        System.out.println("im mehtod for class B");
    }
}

public class Methodoveride {
    public static void main(String[]args){


        A b=new A();
        b.method2();

        B m=new B();
        m.method2();
    }
    
}
