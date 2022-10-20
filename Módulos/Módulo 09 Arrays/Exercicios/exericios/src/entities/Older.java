package entities;

public class Older {
    private String name;
    private int age;
    
    public Older(String name) {
        this.name = name;
    }

    public Older(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    
}
