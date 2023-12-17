import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date(); // Initialize with the current date/time
    }

    // Add a MenuItem to the Menu
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
        this.lastUpdated = new Date(); // Update lastUpdated when adding a new item
    }

    // Remove a MenuItem from the Menu
    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
        this.lastUpdated = new Date(); // Update lastUpdated when removing an item
    }

    // Getters and Setters for Menu fields
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
