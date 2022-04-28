package edu.handong.csee.java.hw2.math;

/**
 * Returns result of operation depending on the input from MathDriver.
 * @author      Seongbin Kim
 * @version     %I%, %G%
 * Edited new from eclipse via gradle.
 */
public class MathCalculator {
	
	/**
	 * Sets the name of the driver.
	 */
    private String name;

    /**
     * Sets the input value in the private field name.
     * @param newName       the name to be set.
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Gets the value in the private field name.
     * @return      the current value in the private field name.
     */
    public String getName() {
        return name;
    }

    /**
     * Compares the values of the two inputs and returns the greater one.
     * @param a     the first value to be compared.
     * @param b     the second value to be compared.
     * @return      returns the greater number between the variables.
     */
    public int getMax(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Compares the values of the two inputs and returns the lesser one.
     * @param a     the first value to be compared.
     * @param b     the second value to be compared.
     * @return      returns the lesser number between the variables.
     */
    public int getMin(int a, int b) {
        return (a < b) ? a : b;
    }

    /**
     * Gets the absolute value of the input.
     * @param a     the value to get the absolute value.
     * @return      returns the absolute value of the variable by multiplying -1 if it is less than 0.
     */
    public int getAbs(int a){
        return (a < 0) ? a*-1 : a;
    }

    /**
     * Gets the sum of the two inputs.
     * @param a     the first value to be added.
     * @param b     the second value to be added.
     * @return      returns the sum of the two variables.
     */
    public int getSum(int a, int b){
        return a+b;
    }

    /**
     * Gets the difference of the two inputs.
     * First, subtract the two inputs.
     * Second, if the value difference is less, than 0 multiply -1 to make it a positive value.
     * @param a     the first value to be compared.
     * @param b     the second value to be compared.
     * @return      returns the absolute value of the variable by multiplying -1 if it is less than 0.
     */
    public int getDiff(int a, int b) {
        return a-b;
    }

    /**
     * Gets the product of the two inputs.
     * @param a     the first value to be multiplied.
     * @param b     the second value to be multiplied.
     * @return      returns the product by multiplying the two variables.
     */
    public int getProduct(int a, int b) {
        return a*b;
    }

    /**
     * Gets the quotient of the two inputs.
     * @param a     the first value to be divided by.
     * @param b     the second value to divide by.
     * @return      returns the quotient by dividing the preceding variable by the succeeding variable.
     */
    public int getQuotient(int a, int b) {
        if(b == 0) return 0;
        return a/b;
    }

    /**
     * Gets the remainder between the two inputs.
     * @param a     the first value to be divided by.
     * @param b     the second value to divide by.
     * @return      returns the remainder when the preceding variable is divided by the succeeding variable.
     */
    public int getRemainder(int a, int b) {
        if(b == 0) return 0;
        return a%b;
    }

    /**
     * Gets the power of an input.
     * @param a     the base of the equation.
     * @param b     the exponent.
     * @return      returns the base(a) to the power of the exponent(b).
     */
    public int getPower(int a, int b) {
        int result = 1;
        if(b < 0) return -1;
        while(b != 0) {
            result *= a;
            b--;
        }

        return result;
    }

    /**
     * Gets the factorial of an input.
     * Multiplies the input by input-n until it reaches 0.
     * @param a     the starting value of the factorial.
     * @return      returns the value of the factorial of the input.
     */
    public int getFactorial(int a) {
        int result = 1;
        for(int i = 1; i <= a; i++) {
            result *= i;
        }

        return result;
    }

    /**
     * Gets the Greatest Common Divisor between two inputs.
     * Starting from 2, until the guessed divisor is less than both numbers, end if the guessed divisor is divisible by both values.
     * @param a     the first value to be compared.
     * @param b     the second value to be compared.
     * @return      returns the Greatest Common Divisor of the two values.
     */
    public int getGcd(int a, int b) {
        if(b == 0) return a;
        return getGcd(b, a%b);
    }

    /**
     * Gets the Least Common Multiple between two inputs.
     * Starting from the greater number, decrease the guess multiple until it is divisible by both values.
     * @param a     the first value to be compared.
     * @param b     the second value to be compared.
     * @return      returns the Least Common Multiple of the two values.
     */
    public int getLcm(int a, int b) {
        int result = (a > b) ? a : b;
        while(true) {
            if((result % a == 0) && (result % b == 0))
                break;
            result++;
        }

        return result;
    }

    /**
     * Gets the square of an input.
     * Multiplies the input by itself.
     * @param a     the value to be squared.
     * @return      returns the value multiplied by the value.
     */
    public int getSquare(int a) {
        return a*a;
    }
}