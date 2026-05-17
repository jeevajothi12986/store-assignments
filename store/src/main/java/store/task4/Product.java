package store.task4;

public class Product {

    private int id;
    private String name;
    private double price;
    private int qty;

    // Constructor
    public Product(int id, String name, double price, int qty) {
        this.id    = id;
        this.name  = name;
        this.price = price;
        this.qty   = qty;
    }

    // Default constructor — Spring Boot needs this to read JSON
    public Product() {}

    // Getters and Setters
    public int getId()                { return id; }
    public void setId(int id)         { this.id = id; }

    public String getName()           { return name; }
    public void setName(String name)  { this.name = name; }

    public double getPrice()              { return price; }
    public void setPrice(double price)    { this.price = price; }

    public int getQty()               { return qty; }
    public void setQty(int qty)       { this.qty = qty; }
}
