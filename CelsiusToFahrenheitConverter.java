// There are two major scales for measuring temperature, celsius & Fahrenheit.Given a 
// floating point input for temperature in celsius scale, Write a program to convert celsius to 
// fahrenheit, up till 2 decimal points.

import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);

        scanner.close();
    }
}
