package Visitor.V1;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attache(new Man());
        objectStructure.attache(new Women());


        Success success = new Success();
        objectStructure.display(success);
        System.out.println("--------------------");
        Fail fail = new Fail();
        objectStructure.display(fail);

    }
}
