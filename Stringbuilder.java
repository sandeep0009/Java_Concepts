public class Stringbuilder {
    public static void main(String[] args) {


        //string builder doesnt create a new object it just append in existing object whihc decrease the time complexity from natural method.
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
    
}
