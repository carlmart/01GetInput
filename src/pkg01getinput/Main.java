/*
Console programming
Testing getting input from User 
 */
package pkg01getinput;
import java.util.Scanner;

public class Main {

    private static Scanner sc;

	public static void main(String[] args) {
        System.out.println("F = 9/5*C  + 32");
        System.out.println("Enter Temp in Celsius #1");
        sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0/5.0 * celsius + 32.0;
        System.out.println("Fahrenheit:"+fahrenheit);
        
        
    }
    
}
