public class MenuItem {
    private String description;
    private double price;
    private String category;
    private boolean isNew;
    private Date lastUpdated;

    public MenuItem(String description, double price, String category, boolean isNew, Date lastUpdated) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
        this.lastUpdated = lastUpdated;
    }

    // Getters and Setters for MenuItem fields
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
