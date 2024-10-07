import java.util.*;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void sortByName() {
        products.sort(Comparator.comparing(Product::getName));
    }

    public void sortByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortByCategory() {
        products.sort(Comparator.comparing(Product::getCategory));
    }

    public void displayUniqueProducts() {
        Set<Product> uniqueProducts = new HashSet<>(products);
        for (Product product : uniqueProducts) {
            System.out.println(product);
        }
    }
}
