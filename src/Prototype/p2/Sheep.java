package Prototype.p2;

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String Color;

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        Color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }


    @Override
    protected Object clone() {

        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {

            System.out.println(e.getMessage());
        }

        return sheep;


    }
}
