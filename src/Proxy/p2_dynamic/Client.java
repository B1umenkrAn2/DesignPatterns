package Proxy.p2_dynamic;

public class Client {
    public static void main(String[] args) {

        ITeacherDAO target = new TeacherDAO();

        ITeacherDAO proxyInstance = (ITeacherDAO) new ProxyFactory(target).getProxyInstance();


//        System.out.println("proxyInstance="+proxyInstance);
//        System.out.println("proxyInstance class="+proxyInstance.getClass());

// dynamic can have multiply interface method. and dont need to change other code to implement the method
        proxyInstance.teach();
        proxyInstance.hello("Tim");
    }
}
