public class Strrings {

    public static void main(String[] args) {
        
        String name="sandeep kumar shah";
        System.out.println(name);

        // strings are basically a character array.
        // everything that starts with Capital word is Class
        // string=data type
        // name=reference variable
        //sandeep=object


        // * storage of string 
        // string pool : sperate structure in memory heap.because all the similar value string will not be created and it will be pointing to same.
        // immutability we cant change this object and strings are immutable. 
        //== checks if the reference variable pointing the  same object
        // when you only need to check value use .equal method


        String a= new String("sandeep");
        String g= new String("sandeep");
        System.out.println(a==g);

        //above code is showing false because value is stored outside of string pool.

        //for making it to check we use .equalto  method.

        System.out.println(a.equals(g));

    
    }
    
}
