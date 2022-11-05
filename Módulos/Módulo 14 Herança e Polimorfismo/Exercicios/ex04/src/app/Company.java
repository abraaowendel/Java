package app;

import entities.TaxPayers;

public class Company extends TaxPayers {

    private Integer numberEmployees;

    public Company() {
    }

    public Company(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double total() {
        Double taxPayer = 0.16;

        if(numberEmployees > 10){
            taxPayer = 0.14;
        }

        return annualIncome * taxPayer;
    }
}
