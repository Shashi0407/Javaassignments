// sum of the first 2 numbers equals the last digit of the 3rd

import java.util.Scanner;

class SumEqualsLastDigit 
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
        
        if ((a + b) % 10 == c % 10) 
{
            System.out.println("The last digit of the sum of " + a + " and " + b + " is equal to the last digit of " + c + ".");
        } else 
{
            System.out.println("The last digit of the sum of " + a + " and " + b + " is not equal to the last digit of " + c + ".");
        }
        
        scanner.close();
    }
}
