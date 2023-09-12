public class SaleLineItem{
  public int quantity;
  public ProductSpecification product;
  public double subTotal;

  public SaleLineItem() {
    super();
  }

  public SaleLineItem(int quantity, ProductSpecification product) {
    this.quantity = quantity;
    this.product = product;
  }

  public int getSubtotal() {
    subTotal = quantity * product;
    return subTotal;
  }
}