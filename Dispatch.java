class SuperClass{
    public void name(){
        System.out.println("im super class");
    }
}

class SubClass extends SuperClass{
    @Override
    public void name(){
        System.out.println("im sub class");
    }
}


class Dispatch{
public static void main(String[]args){
    SuperClass ob=new SubClass();

    ob.name();
}

}
