public class ProductSpecification{
  public String description;
  public double price;
  public int itemId;

  public ProductSpecification() {
    super();
  }

  public ProductSpecification(String description, double price, int itemId) {
    this.description = description;
    this.price = price;
    this.itemId = itemId;
  }

  public double getPrice() {
    return price;
  }
}