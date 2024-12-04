package edu.cis.Model;

import java.util.ArrayList;
import java.util.Iterator;

public class CISUser {
    private String userID;
    private String name;
    private String yearLevel;
    private ArrayList<Order> orders;
    private double money;


    public CISUser(String userID, String name ,String yearLevel, Double money) {
        this.userID = userID;
        this.name = name;
        this.yearLevel = yearLevel;
        this.orders = new ArrayList<>();
        this.money = money;
    }
    public CISUser() {
        this.orders = new ArrayList<>();
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public double getMoney() {
        return money;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "CISUser{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", yearLevel='" + yearLevel + '\'' +
                ", orders= " + orderToString() +
                ", money=" + money +
                '}';
    }

    public void spend(double price) {
        this.money -= price;
    }

    public String orderToString() {
        Iterator<Order> it = orders.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            Order order = it.next();
            sb.append(order);
            if (!it.hasNext()) {
                return sb.toString();
            }
            sb.append(',').append(' ');
        }
    }
}