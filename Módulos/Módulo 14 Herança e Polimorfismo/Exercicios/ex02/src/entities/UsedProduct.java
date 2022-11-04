package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private Date manufacture;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {

    }

    public UsedProduct(String name, Double price, Date manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }

    public Date getManufacture() {
        return manufacture;
    }

    public void setManufacture(Date manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String priceTag() {
        return name + " (usado) R$ " + price + " Recondicionado em " + formatter.format(manufacture);
    }

}
