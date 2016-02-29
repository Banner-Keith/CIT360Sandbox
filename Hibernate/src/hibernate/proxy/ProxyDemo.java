/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.proxy;

/**
 *
 * @author Keith
 */
public class ProxyDemo {
    public void runProxyDemo() {
        // Proxy Pattern
        System.out.println("Proxy Pattern Example:");
        Image image = new ProxyImage("sample-image.jpg");        
        // Loads image from disk.
        System.out.println("\nCalling image.display:");
        image.display();
        //Image has already been loaded so it will just read from memory.
        System.out.println("\nCalling image.display again:");
        image.display();
        System.out.println();
    }
}
