package q3;

import java.util.Scanner;
/**
 * <p>A program that asks the user for a temperature in Fahrenheit
 * and then converts that temperature into Celsius.</p>
 *
 * @author Julia Yiu
 * @version 1.0
 */
public class TempConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int conversion = 32;
        final double CONVERSION = 1.8;
        
        double fahrenheit;
        double celsius;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter temperature in Fahrenheit: ");
        fahrenheit = scan.nextInt();
        
        scan.close();
        
        celsius = (fahrenheit - conversion) / CONVERSION;
        
        System.out.println("The temperature converted into celsius is: " 
                + celsius);
        
        System.out.println("Question three was called and ran sucessfully.");
    }

};
