/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author Keith
 */
public class ItemCollection {

    //Method used to print out the item name and grocery category name from a collection.

    /**
     *
     * @param collection
     * @return
     */
    public String ToString(Collection<Item> collection) {
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);
        sb.append("[ ");
        collection.stream().forEach((item) -> {
            sb.append(item.getId()).append(":").append(item.getName()).append(":").append(item.getGroceryCategory().getName()).append(", ");
        });
        sb.delete(sb.length() - 2, sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    //Method used to print out the item name and grocery category name from a map.

    /**
     *
     * @param map
     * @return
     */
    public String ToString(Map<String, Item> map) {
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);
        sb.append("[ ");
        map.entrySet().stream().forEach((entry) -> {
            sb.append(entry.getValue().getId()).append(":").append(entry.getValue().getName()).append(":").append(entry.getValue().getGroceryCategory().getName()).append(", ");
        });
        sb.delete(sb.length() - 2, sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
}
