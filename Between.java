// Number between 30 and 50

import java.util.Scanner;

class Between 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n >= 30 && n <= 50) {
            System.out.println("The number is between 30 and 50.");
        } else {
            System.out.println("The number is not between 30 and 50.");
        }
        
        scanner.close();
    }
}
