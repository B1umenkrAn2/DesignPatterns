package Proxy.p1_static;

public class Client {
    public static void main(String[] args) {
        TeachDAO teachDAO = new TeachDAO();

        TeacherDAOProxy proxy = new TeacherDAOProxy(teachDAO);

        proxy.teach();
    }
}
