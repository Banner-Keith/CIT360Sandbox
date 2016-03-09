/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
        arrayList();
        linkedList();
        hashSet();
        hashMap();
        treeSet();
        treeMap();        
    }
    
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

    public static void hashMap() {
        Map hashMap = new HashMap();
        
        hashMap.put("hm 1", 1);
        hashMap.put("hm 2", 2);
        hashMap.put("hm 3", 3);
        hashMap.put("hm 4", 4);
        
        System.out.println("HashMap Contents");
        System.out.println(hashMap);
        System.out.println();
    }

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