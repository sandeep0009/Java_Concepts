class Empl{
    private int id;
    private String name;
    //Constructor is created with argument:
    public Empl(String myname,int myid){
        id=myid;
        name=myname;
    }
    public void setName(String s){
        name=s;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class Const {
    public static void main(String[]args){
        Empl san=new Empl("SAndeep",200);
        System.out.println(san.getId());
        System.out.println(san.getName());
    }
    
}
