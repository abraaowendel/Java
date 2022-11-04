package entities;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double valuePerHoure;


    public Employee() {
    }


    public Employee(String name, Integer hours, Double valuePerHoure) {
        this.name = name;
        this.hours = hours;
        this.valuePerHoure = valuePerHoure;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getHours() {
        return hours;
    }


    public void setHours(Integer hours) {
        this.hours = hours;
    }


    public Double getValuePerHoure() {
        return valuePerHoure;
    }


    public void setValuePerHoure(Double valuePerHoure) {
        this.valuePerHoure = valuePerHoure;
    }

    public double payment(){
        return hours * valuePerHoure;
    }
    
    
}
