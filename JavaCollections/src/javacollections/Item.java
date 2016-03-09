package javacollections;

import java.util.Objects;

public class Item {

    private int id;
    private String itemName;
    private String notes;
    private double price;
    private double quantity;
    private int recipeKey;

    public Item() {
    }

    // Constructor for creating item with no recipe foreign key.
    public Item(int id, String itemName, String notes, double price, double quantity) {
        this.id = id;
        this.itemName = itemName;
        this.notes = notes;
        this.price = price;
        this.quantity = quantity;
        this.recipeKey = 0;
    }

    // Constructor for creating item with recipe foreign key
    public Item(int id, String itemName, String notes, double price, double quantity, int recipeKey) {
        this.id = id;
        this.itemName = itemName;
        this.notes = notes;
        this.price = price;
        this.quantity = quantity;
        this.recipeKey = recipeKey;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getNotes() {
        return notes;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public int getRecipeKey() {
        return recipeKey;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setRecipeKey(int recipeKey) {
        this.recipeKey = recipeKey;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.itemName);
        hash = 47 * hash + Objects.hashCode(this.notes);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 47 * hash + this.recipeKey;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity)) {
            return false;
        }
        if (this.recipeKey != other.recipeKey) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", itemName=" + itemName + ", notes=" + notes + ", price=" + price + ", quantity=" + quantity + ", recipeKey=" + recipeKey + '}';
    }
}
