// Check if the multiplication of 2 numbers is not equal to the 3rd number

import java.util.Scanner;

class Multiplication
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();
        
        if (a * b != c) 
{
            System.out.println("The multiplication of " + a + " and " + b + " is not equal to " + c + ".");
        } else {
            System.out.println("The multiplication of " + a + " and " + b + " is equal to " + c + ".");
        }
        
        scanner.close();
    }
}
