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
public class SingletonDemo {
    public void runSingletonDemo() {
        // Singleton Pattern
        System.out.println("Singleton Pattern Example:");
        Singleton singletonExample = Singleton.getInstance();
        singletonExample.demoMethod();
        System.out.println();
    }
}
