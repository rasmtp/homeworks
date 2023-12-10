package Module2;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

class Product {
    private String name;
    private int amount;
    private double price;

    public Product(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public double getOverallPrice() {
        return amount * price;
    }
}
public class Module {
    public static void main(String[] args) {
        List<Product> products = readInputFile("C:\\Users\\roman\\IdeaProjects\\homeworks\\src\\Module2\\Input.txt");
        List<Product> filteredProducts = filterProducts(products);
        List<Product> sortedProducts = sortProductsDescending(products);
        List<Product> overallPrices = displayOverallPrices(products);
        writeOutputFile("C:\\Users\\roman\\IdeaProjects\\homeworks\\src\\Module2\\Output.txt", filteredProducts, sortedProducts, overallPrices);
    }
    private static List<Product> readInputFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(line -> {
                        String[] parts = line.split(",");
                        String name = parts[0];
                        int amount = Integer.parseInt(parts[1]);
                        double price = Double.parseDouble(parts[2]);
                        return new Product(name, amount, price);
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static List<Product> filterProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getAmount() > 4)
                .collect(Collectors.toList());
    }
    private static void writeOutputFile(String fileName, List<Product> products,  List<Product> sortedProducts, List<Product> overallPrices) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Product product : products) {
                writer.write(product.getName() + ", " + product.getAmount() + ", " + product.getPrice() + ";");
                writer.newLine();
                writeToFile("C:\\Users\\roman\\IdeaProjects\\homeworks\\src\\Module2\\Output.txt", sortedProducts);
            }
            for (Product product : products) {
                writer.write(product.getName() + ": " + product.getPrice());
                writer.newLine();
            }
            products.forEach(product -> System.out.println(product.getName() + ": " + product.getOverallPrice()));
            double averagePrice = calculateAveragePrice(products);
            writer.write(String.valueOf("Average price is: " + averagePrice));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Product> getAmountOfAllProducts(List<Product> products, String fileName) throws IOException {
        File fileIn = new File("C:\\Users\\roman\\IdeaProjects\\homeworks\\src\\Module2\\Input.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return null;
        }
    }
    private static double calculateAveragePrice(List<Product> products) {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
    }
    private static List<Product> sortProductsDescending(List<Product> products) {
        return products.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()))
                .collect(Collectors.toList());
    }
    private static void writeToFile(String fileName, List<Product> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Product product : products) {
                writer.write(product.getName() + ": " + product.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static List<Product> displayOverallPrices(List<Product> products) {
        System.out.println("Overall prices for each product:");
        products.forEach(product -> System.out.println(product.getName() + ": " + product.getOverallPrice()));
        return products;
    }
}

