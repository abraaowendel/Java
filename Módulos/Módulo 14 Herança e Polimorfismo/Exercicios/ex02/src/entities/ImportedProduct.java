package entities;

public class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct(){

    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice() {
        return price + customFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + " ( Taxação: R$ " + customFee + " )";
    }
}
