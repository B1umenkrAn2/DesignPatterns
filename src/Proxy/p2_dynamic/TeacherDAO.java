package Proxy.p2_dynamic;

public class TeacherDAO implements ITeacherDAO {
    @Override
    public void teach() {
        System.out.println("teacher is teaching math ");
    }

    @Override
    public void hello(String name) {
        System.out.println("hello "+name);
    }
}
