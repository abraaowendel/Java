package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {

    private String name;
    private WorkLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkLevel level, Double baseSalary, Department departmentName) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = departmentName;
    }

    public Worker(String workName, WorkLevel valueOf, Double workBaseSalary, String departmentName) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int month) {
        Double sum = baseSalary;

        for (HourContract item : contracts) {
            LocalDate date = item.getDate();
            int c_year = date.getYear();
            int c_month = date.getMonthValue();

            if (year == c_year && month == c_month) {
                sum += item.totalValue();
            }
        }
        
        return sum;
    }
}
