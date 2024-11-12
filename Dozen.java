// Check Dozen or not

import java.util.Scanner;

class Dozen 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity of fruits: ");
        int quantity = scanner.nextInt();
        
        if (quantity % 12 == 0) {
            System.out.println("The quantity is exactly in dozens.");
        } else {
            System.out.println("The quantity is not exactly in dozens.");
        }
        
        scanner.close();
    }
}
