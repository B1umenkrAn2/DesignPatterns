package Iterator.I1;


public class Department {

    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Department " + name + " desc :" + desc;
    }
}
