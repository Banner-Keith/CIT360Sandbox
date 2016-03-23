/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.Comparator;

/**
 *
 * @author Keith
 */

// This class allows the objects of the type ITEM to be compared based on the id.
class ItemIdComp implements Comparator<Item> {

    @Override
    public int compare(Item i1, Item i2) {
        if (i1.getId() > i2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
