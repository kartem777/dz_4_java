//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product p1 = new Product("a", 1.5, "Fruits");
        Product p2 = new Product("b", 1.2, "Fruits");
        Product p3 = new Product("c", 2.0, "Vegetables");
        Product p4 = new Product("b", 1.2, "Fruits");

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.addProduct(p4);

        System.out.println("All products:");
        store.displayProducts();

        System.out.println("\nSort by name:");
        store.sortByName();
        store.displayProducts();

        System.out.println("\nSort by price:");
        store.sortByPrice();
        store.displayProducts();

        System.out.println("\nSort by Category:");
        store.sortByCategory();
        store.displayProducts();

        System.out.println("\nUnique products:");
        store.displayUniqueProducts();
    }
}