package Template.T1_Temp_method;

public abstract class SoyMilk {

    final void make() {
        select();
        if (customer()) {
            add();
        }
        soak();
        beat();

    }

    boolean customer(){
        return true;
    }

    void select() {
        System.out.println("select bean ");

    }

    public abstract void add();

    void soak() {
        System.out.println("soaking beans");
    }

    void beat() {
        System.out.println("beating beans ");
    }
}
