class Empl{    //customised class
        int id;
        String name;
        int salary;
        public void printDeatails(){
            System.out.println("id of the person is"+id);
            
            System.out.println("name of the person is "+name);
        }
        public int getSalary(){
            return salary;
        }

}

public class ClassBased {
  
    public static void main(String[]args){
        Empl sandeep=new Empl();
        sandeep.id=21;
        sandeep.name="worldwitnew";
        sandeep.salary=1200;

        sandeep.printDeatails();
        System.out.println(sandeep.getSalary());  


        
    }
}
