package edu.handong.csee.java.hw2;

import edu.handong.csee.java.hw2.math.MathCalculator;

/**
 * Runs the program using MathCalculator to operate.
 * @author      Seongbin Kim
 * @version     %I%, %G%
 * Edited new from eclipse via gradle.
 */
public class MathDriver {
    
    /**
     * Creates an instance of MathDriver to run the program.
     * Passes values recieved from the parameter to the method run(String[] args).
     * @param args      recieves input values that are passed to the run(String[] args) method.
     */
    public static void main(String[] args) {
        MathDriver myDriver = new MathDriver();
        myDriver.run(args);
    }

    /**
     * Creates an instance of MathCalculator to execute the program according to the user's input(s).
     * @param args      passed from the main(String[] args) method. args[1] contains String to set the driver's name; args[2] contains an int value for calculation; (if it is present) args[3] contains an int value for calculation.
     */
    public void run(String[] args) {

        MathCalculator mathCalculator = new MathCalculator();

        mathCalculator.setName(args[0]);

        switch(args[1]) {
            case "Max":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getMax(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Min":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getMin(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Abs":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getAbs(Integer.parseInt(args[2])));
                break;
            case "Sum":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getSum(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Diff":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getDiff(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Product":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getProduct(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Quotient":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getQuotient(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Remainder":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getRemainder(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Power":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getPower(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Factorial":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getFactorial(Integer.parseInt(args[2])));
                break;
            case "Gcd":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getGcd(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Lcm":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getLcm(Integer.parseInt(args[2]), Integer.parseInt(args[3])));
                break;
            case "Square":
                System.out.println("Driver Name: " + mathCalculator.getName() +
                                    ", Answer: " +
                                    mathCalculator.getSquare(Integer.parseInt(args[2])));
                break;
            default:
                System.out.println("Invalid command");
        }
    }
}
