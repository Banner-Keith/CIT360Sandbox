/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Keith
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arrayList();
        //linkedList();
        //hashSet();
        hashMap();
        //treeSet();
        //treeMap();        
    }
    
    // Collection accessed by array. Can be sorted.
    public static void arrayList() {

        List arrayList = new ArrayList();
        
        arrayList.add("al 1");
        arrayList.add("al 2");
        arrayList.add("al 3");
        arrayList.add("al 4");

        System.out.println("ArrayList Contents");
        System.out.println(arrayList);
        System.out.println();
    }
    
    // Collection where object can only be added once
    // objects are sorted.
    public static void treeSet() {
        Set treeSet = new TreeSet();

        treeSet.add("ts 1");
        treeSet.add("ts 2");
        treeSet.add("ts 3");
        treeSet.add("ts 4");
        
        System.out.println("TreeSet Contents");
        System.out.println(treeSet);
        System.out.println();
    }

    // Unsorted collection. Objects added any number of times.
    // FIFO push and pop methods to add and remove.
    public static void linkedList() {
        List linkedList = new LinkedList();
        
        linkedList.add("ll 1");
        linkedList.add("ll 2");
        linkedList.add("ll 3");
        linkedList.add("ll 4");
        
        System.out.println("LinkedList Contents");
        System.out.println(linkedList);
        System.out.println();
    }

    // 
    public static void hashSet() {
        Set hashSet = new HashSet();

        hashSet.add("hs 1");
        hashSet.add("hs 2");
        hashSet.add("hs 3");
        hashSet.add("hs 4");

        System.out.println("HashSet Contents");
        System.out.println(hashSet);
        System.out.println();
    }

    // Unsorted key/value pairs. Key used to get value.
    // put and get. List of all values, not in order.
    public static void hashMap() {
        Map<String, Item> employeeHashMap = new HashMap<>();
        
        employeeHashMap.put("flour", new Item(1, "Flour", "", 1.00, 1, 1));
        employeeHashMap.put("eggs", new Item(2, "Dozen Eggs", "", 2.20, 6, 1));
        employeeHashMap.put("milk", new Item(3, "Milk", "Buy at Walmart", 2.00, 2, 1));
        employeeHashMap.put("sales", new Item(4, "Chocolate Chips", "", 2.50, 1, 1));
        
        System.out.println("HashMap Contents");
        System.out.println(employeeHashMap);
        System.out.println();
    }

    // Sorted tree of values. Sorted by map ordering keys,
    // not values. put and get.
    // Methods to get keys in order:
    // firstKey, higherKey, lastKey, lowerKey
    public static void treeMap() {
        Map treeMap = new TreeMap();
        
        treeMap.put("tm 1", 1);
        treeMap.put("tm 2", 2);
        treeMap.put("tm 3", 3);
        treeMap.put("tm 4", 4);

        System.out.println("TreeMap Contents");
        System.out.println(treeMap);
        System.out.println();
    }
}