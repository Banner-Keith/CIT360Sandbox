/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parallelprocessing;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Keith
 */
public class AtomicCounter {
    AtomicInteger value = new AtomicInteger();
    
    public int next() {
        return value.incrementAndGet();
    }
}
