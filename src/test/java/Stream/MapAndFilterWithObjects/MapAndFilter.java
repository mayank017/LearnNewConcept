package Stream.MapAndFilterWithObjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapAndFilter {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Pen", 100);
        Product p2 = new Product(2, "Pencil", 200);
        Product p3 = new Product(3, "Copy", 300);
        Product p4 = new Product(4, "Book", 400);

        List<Product> myList = Arrays.asList(p1, p2, p3, p4);

        List<Double> updatedList = myList.stream().filter(x -> x.getIdOfProduct() > 2)
                .map(x -> x.getPrice() + (x.getPrice() * 0.10))
                .collect(Collectors.toList());

        System.out.println(updatedList);
    }
}
