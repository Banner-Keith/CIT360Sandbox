/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.singleton;

/**
 *
 * @author Keith
 */
public class Singleton {
    private static Singleton instance = null;
    
    private Singleton() { }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void demoMethod() {
        System.out.println("Demo Singleton");
    }
}