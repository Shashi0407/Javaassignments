// Check if the last digit of a number is 0

import java.util.Scanner;

class LastDigit {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n % 10 == 0) {
            System.out.println("The last digit of " + n + " is 0.");
        } else {
            System.out.println("The last digit of " + n + " is not 0.");
        }
        
        scanner.close();
    }
}
