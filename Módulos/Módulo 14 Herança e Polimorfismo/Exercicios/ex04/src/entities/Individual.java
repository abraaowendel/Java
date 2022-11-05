package entities;

public class Individual extends TaxPayers {

    private Double healthSpending;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    @Override
    public double total() {
        Double taxPayer = 0.15;

        if (annualIncome >= 20000) {
            taxPayer = 0.25;
        }

        return (annualIncome * taxPayer) - (healthSpending * 0.5);
    }

}
