package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public Double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getProduct().getName() + ", ");
        sb.append("Preço: R$ " + price + ", ");
        sb.append("Quantidade: " + quantity + ", ");
        sb.append("Subtotal: R$" + subTotal() + "\n");

        return sb.toString();
    }

}
