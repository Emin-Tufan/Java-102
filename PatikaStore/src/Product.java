import java.util.ArrayList;
import java.util.Scanner;

public abstract class Product {
    private int productId;
    private String productName;
    private int price;
    private double discountRate;
    private  int stock;
    private String brand;
    private int memory;
    private double screenSize;
    private int ram;
    abstract void controlMenu();
    abstract void showProduct();
    abstract void addProduct();
    abstract void removeProduct();
    abstract void filterProduct();

    Scanner input=new Scanner(System.in);
    public Product(int productId, String productName, int price,
                   double discountRate, int stock, String  brand, int memory, double screenSize, int ram) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }
    public Product(){

    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String  getBrand() {
        return brand;
    }

    public void setBrand(String  brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
