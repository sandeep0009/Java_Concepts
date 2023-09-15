interface Bicycle{
    void speedup(int incre);
    void decrease(int decreament);
}


class Avon implements Bicycle{

    int speed=7;
    @Override
    public void speedup(int incre){
        speed=speed+incre;
    }

    @Override

    public void decrease(int decreament){
        speed=speed-decreament;
    }

}

public class Interface {


    public static void main(String[]args){
    Avon ob=new Avon();
    ob.speedup(8);

    System.out.print(ob.speedup);
    

    }

    
}
