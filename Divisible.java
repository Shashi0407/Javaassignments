//Check if a number is divisible by 3

import java.util.Scanner;
class DivisibleByThree 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n % 3 == 0) 
{
            System.out.println(n + " is divisible by 3.");
        } else {
            System.out.println(n + " is not divisible by 3.");
        }
        
        scanner.close();
    }
}
