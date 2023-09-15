interface Sample{
    void meth();
    void method();
}

interface childSample extends Sample{
    void meth4();
    void meth3();

}
class Mysample implements childSample{
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }

    public void meth(){
        System.out.println("meth1");
    }

    public void method(){
        System.out.println("meth2");
    }

}

class inheritanceininterface{
    public static void main(String []args){
        Mysample n= new Mysample();
        n.meth();
    }
}