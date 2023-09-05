class Base{
    int x;
    Base(){
        System.out.println("constructor of base class");
    }
    Base(int b){
        System.out.println("im a constructor with a value of a:"+b);
    }
    public void setValue(int m){
        this.x=m;
    }

    public int getValue(){
        return x;
    }
}

class Derived extends Base{
    int y;

    Derived(){
        super(8);
        System.out.println("constructor of derived class");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("im a constructor with a value y:"+ y);
    }
    public void setValuey(int n){
        this.y=n;
    }
    public int getValuey(){
        return y;
    }
}


public class InheritConst{
    public static void main(String[]args){
        // Base b= new Base();

        // Derived q=new Derived();

        Derived m=new Derived(4, 12);

    }
}