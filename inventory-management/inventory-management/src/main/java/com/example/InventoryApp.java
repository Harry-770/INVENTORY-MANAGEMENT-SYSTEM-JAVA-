package com.example;
import java.util.List;
import java.util.Scanner;
public class InventoryApp {
    private static final ProductDAO dao = new ProductDAO();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Inventory Menu ===");
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> addProduct();
                case 2 -> listProducts();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }
    private static void addProduct() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product();
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);
        dao.saveProduct(product);
        System.out.println("Product added!");
    }
    private static void listProducts() {
        List<Product> products = dao.getAllProducts();
        for (Product p : products) {
            System.out.printf("ID: %d | %s | Qty: %d | $%.2f\n",
                    p.getId(), p.getName(), p.getQuantity(), p.getPrice());
        }
    }
    private static void updateProduct() {
        System.out.print("Enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = dao.getProductById(id);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.print("New quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        product.setQuantity(quantity);
        dao.updateProduct(product);
        System.out.println("Product updated.");
    }
    private static void deleteProduct() {
        System.out.print("Enter product ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        dao.deleteProduct(id);
        System.out.println("Product deleted.");
    }
}