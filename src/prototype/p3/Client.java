package prototype.p3;

public class Client {

    public static void main(String[] args) throws Exception{
        DeepProtoType p = new DeepProtoType();

        p.name ="A1";

        p.deepCloneableTarget= new deepCloneableTarget("b2","b2class");

        //method 1  for deep copy

//        DeepProtoType p2 = (DeepProtoType)p.clone();
//        System.out.println("P.name="+p.name+"p.deep="+p.deepCloneableTarget.hashCode());
//        System.out.println("P2.name="+p2.name+"p2.deep="+p2.deepCloneableTarget.hashCode());

        //method 2 for deep copy
        DeepProtoType p2 = (DeepProtoType)p.deepClone();
        System.out.println("P.name="+p.name+"p.deep="+p.deepCloneableTarget.hashCode());
        System.out.println("P2.name="+p2.name+"p2.deep="+p2.deepCloneableTarget.hashCode());

    }
}
