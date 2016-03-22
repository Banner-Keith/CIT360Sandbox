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
    StringBuilder sb = new StringBuilder();

    //Four items created for use in these collection examples
    //Item(int id, String itemName, String notes, double price, double quantity, GroceryCategory groceryCategory, int recipeKey)
    Item flour = new Item(1, "Flour", "", 1.00, 1, GENERAL, 1);
    Item eggs = new Item(2, "Eggs", "", 2.20, 6, DAIRY, 1);
    Item milk = new Item(3, "Milk", "Buy at Walmart", 2.00, 1, DAIRY, 1);
    Item chocolateChips = new Item(4, "Chocolate Chips", "", 3.50, 2, GENERAL, 1);

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
        System.out.println("ArrayList contents before sort by item name:");
        printArrayList(itemArrayList);
        
        //Sorts the list by the name of the item.
        itemArrayList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));

        System.out.println("ArrayList contents after sort by item name:");
        printArrayList(itemArrayList);
        
        //Sorts the list by the id # of the grocery category.
        itemArrayList.sort((o1, o2) -> o1.getGroceryCategory().getId() - o2.getGroceryCategory().getId());

        System.out.println("ArrayList contents after sort by item name:");
        printArrayList(itemArrayList);
        
        
        System.out.println();
    }
    
    //Method used above to print out the item name and grocery category name
    //from the itemArrayList above.
    private void printArrayList(ArrayList<Item> arrayList) {
        sb.setLength(0);
        sb.append("[ ");
        arrayList.stream().forEach((item) -> {
            sb.append(item.getName()).append(":").append(item.getGroceryCategory().getName()).append(", ");
        });
        sb.delete(sb.length() - 2, sb.length() - 1);
        sb.append(" ]");
        System.out.println(sb.toString());
    }

    // Unsorted collection. Objects added any number of times.
    // FIFO push and pop methods to add and remove.
    public void linkedList() {
        LinkedList<Item> linkedList = new LinkedList<>();

        linkedList.add(flour);
        linkedList.add(eggs);
        linkedList.add(milk);
        linkedList.add(chocolateChips);

        System.out.println("LinkedList Contents:");
        System.out.println(linkedList);
        System.out.println();
    }

    // Collection where object can only be added once
    // objects are sorted.
    public void treeSet() {
        TreeSet<Item> treeSet = new TreeSet<>();

        treeSet.add(flour);
        treeSet.add(eggs);
        treeSet.add(milk);
        treeSet.add(chocolateChips);

        System.out.println("TreeSet Contents:");
        System.out.println(treeSet);
        System.out.println();
    }

    // Collection
    public void hashSet() {
        HashSet<Item> hashSet = new HashSet<>();

        hashSet.add(flour);
        hashSet.add(eggs);
        hashSet.add(milk);
        hashSet.add(chocolateChips);

        System.out.println("HashSet Contents");
        System.out.println(hashSet);
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

        System.out.println("TreeMap Contents");
        System.out.println(treeMap);
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

        System.out.println("HashMap Contents");
        System.out.println(hashMap);
        System.out.println();
    }
}
