/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.database;

/**
 *
 * @author Keith
 */
public class HibernateDemo {
    public void runHibernateDemo() {
        // Hibernate
        System.out.println("Hibernate Example:");
        StoreData storeData = new StoreData();
        storeData.storeEmployeeData(100, "John", "Doe");
        System.out.println();
    }
}
