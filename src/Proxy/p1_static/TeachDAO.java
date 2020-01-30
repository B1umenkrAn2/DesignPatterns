package Proxy.p1_static;

public class TeachDAO implements ITeacherDAO {
    @Override
    public void teach() {
        System.out.println("teacher is teaching ");
    }
}
