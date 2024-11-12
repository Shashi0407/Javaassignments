// first number is greater than both the second and third numbers

import java.util.Scanner;

class Greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number (c): ");
        int c = scanner.nextInt();
        
        if (a > b && a > c) {
            System.out.println("The first number is greater than both the second and third numbers.");
        } else {
            System.out.println("The first number is not greater than both the second and third numbers.");
        }
        
        scanner.close();
    }
}
