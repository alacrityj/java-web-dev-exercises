package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {
    private double price;
    private String description;
    private String name;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String name, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.name = name;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
