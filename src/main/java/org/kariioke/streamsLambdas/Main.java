package org.kariioke.streamsLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public void main () {
        List<String> filteredProductsByCategory = productsList.stream()
                .filter(p -> p.getCategory().equals("Electronics"))
                .map(Product::getName)
                .toList();

        System.out.println(filteredProductsByCategory);

        List<String> filteredProductsByRating = productsList.stream()
                .filter(p -> p.getRating() < 4.5)
                .map(Product::getName)
                .toList();

        System.out.println(filteredProductsByRating);
    }


    List<Product> productsList = Arrays.asList(
            new Product("PS5", "Electronics", 1000.00, 5.0),
            new Product("Mbulu", "Electronics", 750.00, 4.5),
            new Product("Sofa", "Furniture", 1000.00, 4.0),
            new Product("Working station", "Furniture", 1900.00, 3.0)
    );
}
