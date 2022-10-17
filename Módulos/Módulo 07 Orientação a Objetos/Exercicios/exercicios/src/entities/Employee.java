package entities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary() {
        return GrossSalary - Tax;
    }

    public double IncreaseSalary(double percentage) {
        return (GrossSalary - Tax) + (GrossSalary * 10 / 100);
    }
}
