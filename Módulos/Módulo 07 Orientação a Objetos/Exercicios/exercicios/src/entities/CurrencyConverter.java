package entities;

public class CurrencyConverter {
    
    public static double Conversion(double currency, double amount) {
        return currency * amount;
    }

    public static double CalculateIof(double value) {
        value += value * 6 / 100;
        return value;
    }
}
