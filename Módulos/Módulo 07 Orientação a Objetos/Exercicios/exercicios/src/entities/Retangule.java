package entities;

import java.lang.Math.*;

public class Retangule {

    public double width;
    public double height;

    public double Area() {
        return width * height;
    }

    public double Perimeter() {
        return 2 * (width + height);
    }

    public double Diagonal() {
        double formula = Math.pow(width, 2) + Math.pow(height, 2);
        return Math.sqrt(formula);
    }

}
