//Eligible to vote

import java.util.Scanner;

class Vote
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
        
        scanner.close();
    }
}
