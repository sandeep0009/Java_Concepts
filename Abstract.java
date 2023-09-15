abstract class Parent{
    public void Parent(){
        System.out.println("hi im constructor");
        
    }

   abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}

public class Abstract {

    public static void main(String[]args){

    // Parent ob=new Parent(); not possbile.
    Child ob=new Child();
    ob.greet();

    }

    
}
