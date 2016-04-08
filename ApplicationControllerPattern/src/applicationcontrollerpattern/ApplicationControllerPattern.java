/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpattern;

import java.util.Scanner;

/**
 *
 * @author Keith
 */
public class ApplicationControllerPattern {

    private static final String MENUITEMS = "What operation would you like to perform?"
            + "/n1. Addition"
            + "/n2. Subtraction"
            + "/n3. Multiplication"
            + "/n4. Division"
            + "/n0. Exit";

    static double[] inputs = new double[2];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayApcMenu();
    }

    public static void displayApcMenu() {
        boolean valid = false;
        while (!valid) {
            System.out.println(MENUITEMS);
            Scanner scanner = new Scanner(System.in);
            int menuChoice = scanner.nextInt();
            valid = runExample(menuChoice);
        }
    }

    public static boolean runExample(int menuChoice) {
        char operator = '+';
        switch (menuChoice) {
            case 0:
                return true;
            case 1:
                operator = '+';
                break;
            case 2:
                operator = '-';
                break;
            case 3:
                operator = '*';
                break;
            case 4:
                operator = '÷';
                break;
            default:
                System.out.println("Invalid input.");
        }        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        inputs[0] = scanner.nextDouble();

        System.out.print("Enter another number: ");
        inputs[1] = scanner.nextDouble();
        
        ApplicationController applicationController = new ApplicationController();

        System.out.println("The answer is: " + applicationController.requestCalculation(operator, inputs));
        
        return false; //Menu repeats after operation until user exits.
    }
}
