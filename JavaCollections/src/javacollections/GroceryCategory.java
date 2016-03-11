/*
 * Created by Keith Banner
 * 
 */
package javacollections;

/**
 *
 * @author Keith
 */
public enum GroceryCategory {

    PRODUCE(1, "Produce"),
    DELI(2, "Deli"),
    MEAT(3, "Meat"),
    DAIRY(4, "Dairy"),
    BAKERY(5, "Bakery"),
    FROZEN(6, "Frozen"),
    GENERAL(7, "General");

    private final int id;
    private final String name;

    private GroceryCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
