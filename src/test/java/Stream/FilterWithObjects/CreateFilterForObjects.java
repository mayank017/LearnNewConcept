package Stream.FilterWithObjects;

import java.util.Arrays;
import java.util.List;

public class CreateFilterForObjects {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Pencil");
        Product p2 = new Product(2, "Pen");
        Product p3 = new Product(3, "Book");
        Product p4 = new Product(4, "Copy");
        Product p5 = new Product(5, "Duster");

        List<Product> productObjectList = Arrays.asList(p1, p2, p3, p4, p5);

        productObjectList.stream().filter(x -> x.getIdOfProduct() > 3)
                .forEach(x -> System.out.println(x.getIdOfProduct() + " " + x.getNameOfProduct()) );
    }
}
