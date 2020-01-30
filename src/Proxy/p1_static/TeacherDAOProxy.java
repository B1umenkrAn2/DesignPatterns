package Proxy.p1_static;

// Proxy object
public class TeacherDAOProxy implements ITeacherDAO {

    private ITeacherDAO target; // aggregate by proxy object

    public TeacherDAOProxy(ITeacherDAO target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("start proxy");
        target.teach();
        System.out.println("end...");
    }
}
