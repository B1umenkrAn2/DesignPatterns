package Bridge.Bridge1;

public class client {

    public static void main(String[] args) {

        phone phone1 = new foldedPhone(new iphone());

        phone1.open();

        phone1.call();

        phone1.close();

        System.out.println("=============================");
        phone phone2 = new foldedPhone(new huawei());

        phone2.open();

        phone2.call();

        phone2.close();

        System.out.println("=============================");

        phone phone3 = new uprightPhone(new iphone());

        phone3.open();
        phone3.call();
        phone3.close();
    }
}
