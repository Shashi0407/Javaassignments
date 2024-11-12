// Divisible by Both 3 amd 5

import java.util.Scanner;

class DivisibleByThreeAndFive 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5.");
        } else {
            System.out.println("The number is not divisible by both 3 and 5.");
        }
        
        scanner.close();
    }
}
