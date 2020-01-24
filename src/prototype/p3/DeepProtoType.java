package prototype.p3;

import java.io.*;

// 原型模式

public class DeepProtoType implements Serializable, Cloneable {
    public String name; // String 属性
    public deepCloneableTarget deepCloneableTarget;// 引用类型

    public DeepProtoType() {
        super();
    }


    //深拷贝 - 方式  1 使用clone方法


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 这里完成对基本数据类型(属性)和String克隆
        deep = super.clone();
        //对引入类型的属性,进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (deepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }

    //method 2 for deep copy 通过序列化实现(推荐)  这种方法适合多个引用对象的深拷贝

    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {

                bos.close();
                oos.close();
                bis.close();
                ois.close();

            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}
