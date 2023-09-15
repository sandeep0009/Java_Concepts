interface Camera{
    void takeSnap();
    void record();
    default void record4k(){
        System.out.println("recording");
    }
}

interface Wifi{
    String[] getnetworks();
    void connnecct(String network);
}

class Mycell{
    void call(int phonenumber){
        System.out.println("calling"+phonenumber);
    }
    void pickcall(){
        System.out.println("connecting");
    }
}


class Smartphone extends Mycell implements Wifi ,Camera{

   public void takeSnap(){
        System.out.println("taking snap");
    }

    public void recod(){
        System.out.println("taking");
    }

    public String[] getnetworks(){
        System.out.println("getting list");
        String[]networklist={"harry","jarry"};
        return networklist;
    }

    public void connnecct(String network){
        System.out.println("connecting"+network);
    }


}

class inter{
    public static void main(String[]args){
        Smartphone ms=new Smartphone();
        String[]ar=ms.getnetworks();

        ms.record4k();
        for(String item:ar){
            System.out.println(item);
        }
    }
}