package Composite.c1;

// this class can be a interface or abstract
public abstract class OrganizationComponent {

    private String name;
    private String des;

    protected void add(OrganizationComponent oc) {

        throw new UnsupportedOperationException();

    }

    protected void remove(OrganizationComponent oc) {
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    // print method to output result
    protected abstract void print();
}
