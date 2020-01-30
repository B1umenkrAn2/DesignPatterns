package Proxy.p3_Cglib;

public class Client {
    public static void main(String[] args) {
        // create target object

        TeacherDAO teacherDAO = new TeacherDAO();

        TeacherDAO instance = (TeacherDAO) new ProxyFactory(teacherDAO).getProxyInstance();

        instance.teach();

    }
}
