package q2;
import java.util.Scanner;
/**
 * <p>A program that asks the user for a time duration in hours, minutes, 
 * and seconds, and then prints the equivalent duration in only seconds.
 * For example: 1 hour 28 minutes 42 seconds would equal to 5322 seconds.</p>
 *
 * @author Julia Yiu
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int minsTOsecs = 60;
        final int hoursTOsecs = 3600;
        
        int hours;
        int minutes;
        int seconds;
        int totalseconds;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter hours: ");
        hours = scan.nextInt();        
        
        System.out.println("Enter minutes: ");
        minutes = scan.nextInt();
        
        System.out.println("Enter seconds: ");
        seconds = scan.nextInt();
        
        scan.close();
        
        hours = hoursTOsecs * hours;
        minutes = minsTOsecs * minutes;
        totalseconds = hours + minutes + seconds;
         
        System.out.println("Total number of seconds is: " + totalseconds);
        
        System.out.println("Question two was called and ran sucessfully.");
    }

}
