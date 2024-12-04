package edu.cis.Model;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> eatriumItems;
    private String adminID;

    public ArrayList<MenuItem> getEatriumItems() {
        return eatriumItems;
    }

    public void setEatriumItems(ArrayList<MenuItem> eatriumItems) {
        this.eatriumItems = eatriumItems;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public Menu(ArrayList<MenuItem> eatriumItems, String adminID) {
        this.eatriumItems = eatriumItems;
        this.adminID = adminID;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "eatriumItems=" + eatriumItems +
                ", adminID='" + adminID + '\'' +
                '}';
    }
}
