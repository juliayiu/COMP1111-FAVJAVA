package q4;
import java.util.Scanner;
/**
 * <p>A program that reads the radius and height of a cylinder
 * and then prints out the cylinder's volume.</p>
 *
 * @author Julia Yiu
 * @version 1.0
 */
public class Cylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
            
        double radius;
        double height;
        double volume;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the radius of the cylinder: ");
        radius = scan.nextInt();
        
        System.out.println("Enter the height of the cylinder: ");
        height = scan.nextInt();
        
        scan.close();
        
        volume = Math.PI * Math.pow(radius, 2) * height;
        
        System.out.println("The cyclinder's volume is: " + volume);
        
        System.out.println("Question four was called and ran sucessfully.");
    }

};
