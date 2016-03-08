/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parallelprocessing;

import java.util.Scanner;

/**
 *
 * @author Keith
 */
public class ParallelProcessing {
    static int numberOfRacers = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getNumberOfRacers();
        SimpleThreads.simpleThreadsExample(numberOfRacers);
    }
    
    public static void getNumberOfRacers() {
        boolean valid = false;
        while (!valid) {
            System.out.println("Enter a number between 2 and 10 for how many threads you want to race.");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input <= 10 && input > 1) {
                numberOfRacers = input;
                valid = true;
            }
            else {
                System.out.println("Invalid input, number must be between 2 and 10 inclusive.");
            }
        }
    }
}