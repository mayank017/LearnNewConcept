package Stream.MapAndFilterWithObjects;

public class Product {
    private int idOfProduct;
    private String nameOfProduct;
    private int price;

    public Product(int idOfProduct, String nameOfProduct, int price) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public int getIdOfProduct() {
        return idOfProduct;
    }

    public void setIdOfProduct(int idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
