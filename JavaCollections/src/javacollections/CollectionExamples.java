/*
 * Created by Keith Banner
 * 
 */
package javacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import static javacollections.GroceryCategory.DAIRY;
import static javacollections.GroceryCategory.GENERAL;

/**
 *
 * @author Keith
 */
public class CollectionExamples {
    ItemCollection itemCollection = new ItemCollection();
    
    //Four items created for use in these collection examples
    //Item(int id, String itemName, String notes, double price, double quantity, GroceryCategory groceryCategory, int recipeKey)
    Item flour = new Item(0, "Flour", "", 1.00, 1, GENERAL, 1);
    Item eggs = new Item(1, "Eggs", "", 2.20, 6, DAIRY, 1);
    Item milk = new Item(2, "Milk", "Buy at Walmart", 2.00, 1, DAIRY, 1);
    Item chocolateChips = new Item(3, "Chocolate Chips", "", 3.50, 2, GENERAL, 1);

    // Collection accessed like array. Can be sorted.
    // ArrayList works great in situations where random access is needed.
    // You can specify a particular item by it's index and access it directly.
    public void arrayList() {
        ArrayList<Item> itemArrayList = new ArrayList<>();

        itemArrayList.add(flour);           //Index 0
        itemArrayList.add(eggs);            //Index 1
        itemArrayList.add(milk);            //Index 2
        itemArrayList.add(chocolateChips);  //Index 3

        //Example of sorting---------------------------------------------------------------------------
        System.out.println("ArrayList contents before sort by item name:"
                + itemCollection.ToString(itemArrayList));
        
        System.out.println("Sorting ArrayList by item name.");
        itemArrayList.sort(new ItemNameComp());

        System.out.println("ArrayList contents after sort by item name:"
                + itemCollection.ToString(itemArrayList));
        
        System.out.println("Sorting ArrayList by grocery category.");
        itemArrayList.sort(new ItemGroceryCategoryComp());

        System.out.println("ArrayList contents after sort by grocery category:"
                + itemCollection.ToString(itemArrayList));
        
        System.out.println();
    }

    // Unsorted collection. Objects added any number of times.
    // FIFO push and pop methods to add and remove.
    public void linkedList() {
        LinkedList<Item> linkedList = new LinkedList<>();

        System.out.println("Items inserted into LinkedList: flour, eggs, milk, chocolateChips");
        
        linkedList.add(flour);
        linkedList.add(eggs);
        linkedList.add(milk);
        linkedList.add(chocolateChips);

        System.out.println("LinkedList Contents:"
                + itemCollection.ToString(linkedList));
        
        System.out.println("Remove Milk from list");
        linkedList.remove(milk);
        
        System.out.println("LinkedList Contents:"
                + itemCollection.ToString(linkedList));
        
        System.out.println();
    }

    // Collection where object can only be added once
    // objects are sorted.
    public void treeSet() {
        //TreeSet that is automatically ordered by item name.
        TreeSet<Item> treeSetName = new TreeSet<>(new ItemNameComp());

        System.out.println("Example of treeSet that is ordered on the item name");
        System.out.println("Items inserted into TreeSetName: flour, eggs, milk, chocolateChips");
        
        treeSetName.add(flour);
        treeSetName.add(eggs);
        treeSetName.add(milk);
        treeSetName.add(chocolateChips);

        System.out.println("TreeSetName Contents:"
                + itemCollection.ToString(treeSetName));
        System.out.println(((TreeSet) treeSetName).comparator());
        
        //TreeSet that is automatically ordered by item name.
        TreeSet<Item> treeSetId = new TreeSet<>(new ItemIdComp());
        
        System.out.println();
        
        System.out.println("Example of treeSet that is ordered on the item ID");
        System.out.println("Items inserted into TreeSetId: flour:0, milk:2, eggs:1, chocolateChips:3");
        
        treeSetId.add(flour);
        treeSetId.add(milk);
        treeSetId.add(eggs);
        treeSetId.add(chocolateChips);

        System.out.println("TreeSetId Contents:"
                + itemCollection.ToString(treeSetId));
        System.out.println(((TreeSet) treeSetId).comparator());
        
        System.out.println();
    }

    // Collection
    public void hashSet() {
        HashSet<Item> hashSet = new HashSet<>();

        hashSet.add(flour);
        hashSet.add(eggs);
        hashSet.add(milk);
        hashSet.add(chocolateChips);
        
        System.out.println("Items inserted into HashSet: flour, eggs, milk, chocolateChips");

        System.out.println("HashSet Contents:"
                + itemCollection.ToString(hashSet));
        
        System.out.println("Attempting to add flour to list again.");
        
        if (hashSet.add(flour)) { //If add returns true.
            System.out.println("Flour added");
        }
        else { //If add returns false.
            System.out.println("Flour not added. Duplicate item.");
        }
        
        System.out.println("HashSet Contents:"
                + itemCollection.ToString(hashSet));
        
        System.out.println();
    }

    // Map: Sorted tree of values. Sorted by map ordering keys,
    // not values. put and get.
    // Methods to get keys in order:
    // firstKey, higherKey, lastKey, lowerKey
    public void treeMap() {
        TreeMap<String, Item> treeMap = new TreeMap<>();

        treeMap.put("flour", flour);
        treeMap.put("eggs", eggs);
        treeMap.put("milk", milk);
        treeMap.put("chocolate chips", chocolateChips);

        System.out.println("TreeMap Contents:"
                + itemCollection.ToString(treeMap));
        
        System.out.println();
    }

    // Map: Unsorted key/value pairs. Key used to get value.
    // put and get. List of all values, not in order.
    public void hashMap() {
        HashMap<String, Item> hashMap = new HashMap<>();

        hashMap.put("flour", flour);
        hashMap.put("eggs", eggs);
        hashMap.put("milk", milk);
        hashMap.put("chocolate chips", chocolateChips);

        System.out.println("HashMap Contents:"
                + itemCollection.ToString(hashMap));
        
        System.out.println();
    }
}
