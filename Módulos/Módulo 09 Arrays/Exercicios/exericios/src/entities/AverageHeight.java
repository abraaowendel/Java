package entities;

public class AverageHeight {

    private String name;
    private double height;
    private int age;

    public AverageHeight(String name, double height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

}
