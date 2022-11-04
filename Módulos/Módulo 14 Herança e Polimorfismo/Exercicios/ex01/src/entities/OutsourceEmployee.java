package entities;

public class OutsourceEmployee extends Employee {

    private double additionalCharge;

    public OutsourceEmployee() {
    }


    public OutsourceEmployee(String name, Integer hours, Double valuePerHoure, double additionalCharge) {
        super(name, hours, valuePerHoure);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
