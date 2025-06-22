import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ecommerce {
    static class Product {
        int productId;
        String productName;
        String category;

        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return productId + " - " + productName + " (" + category + ")";
        }
    }

    // Linear Search
    static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) return p;
        }
        return null;
    }

    // Binary Search
    static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Phone", "Electronics"),
            new Product(150, "Shoes", "Fashion"),
            new Product(999, "Tablet", "Electronics")
        };
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product ID to search: ");
        int targetId = scanner.nextInt();

        Product foundLinear = linearSearch(products, targetId);
        Product foundBinary = binarySearch(products, targetId);

        System.out.println("-- Linear Search Result --");
        System.out.println(foundLinear != null ? foundLinear : "Product not found.");
        System.out.println("-- Binary Search Result --");
        System.out.println(foundBinary != null ? foundBinary : "Product not found.");

        scanner.close();
    }
}

