package edu.cis.Model;

public class MenuItem {

    private String name;
    private String description;
    private double price;
    private String id;
    private int amountAvaliable;
    private String type;

    public MenuItem(String name, String description, double price, String id, int amountAvaliable, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.id = id;
        this.amountAvaliable = amountAvaliable;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmountAvaliable() {
        return amountAvaliable;
    }

    public void setAmountAvaliable(int amountAvaliable) {
        this.amountAvaliable = amountAvaliable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", amountAvaliable=" + amountAvaliable +
                ", type='" + type + '\'' +
                '}';
    }
}
