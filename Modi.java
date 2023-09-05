class Empl {
    private int id;
    private String name;

    public void setName(String s) {
        name = s;
    }

    public void setId(int n) {
        id = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Modi {
    public static void main(String[] args) {
        Empl sandeep = new Empl();
        sandeep.setName("codewithsandeep");
        System.out.println(sandeep.getName());
    }
}
