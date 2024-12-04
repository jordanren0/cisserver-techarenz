package edu.cis.Model;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String id;
    private int amountAvailable;
    private String type;

    public MenuItem(String itemId, String itemName, String description, double price, String itemType) {
        this.id = itemId;
        this.name = itemName;
        this.description = description;
        this.price = price;
        this.type = itemType;
        this.amountAvailable = 10;
    }

    public MenuItem() {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", amountAvailable=" + amountAvailable +
                ", type='" + type + '\'' +
                '}';
    }

    public void minusAmountAvailable() {
        this.amountAvailable -= 1;
    }
}