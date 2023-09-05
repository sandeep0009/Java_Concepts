 

class Base{
    int x;
    public void setvalue(int m){
        this.x=m;
    }

    public int getvalue(){
        return x;
    }
    public Base(){
        System.out.println("this is constructor:");
    }

}


// for inheritance we use extends keyword

class  BaseX extends Base{
    int y;
    public void setValuey(int n){
        this.y=n;
    }
    public int getValuey(){
        return y;
    }

}


public class Inherit{
 public static void main(String[]args){
       BaseX b= new BaseX();
        b.setValuey(4);
        System.out.println(b.getValuey());

        Base s=new Base();
        s.setvalue(50);
        System.out.println(s.getvalue());
 }


}