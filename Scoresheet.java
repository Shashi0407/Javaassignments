// Scoresheet

import java.util.Scanner;

class Scoresheet 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        int m1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int m2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int m3 = scanner.nextInt();
        System.out.print("Enter marks for subject 4: ");
        int m4 = scanner.nextInt();
        
        double average = (m1 + m2 + m3 + m4) / 4.0;
        
        if (average >= 60) {
            System.out.println("The average mark is greater than or equal to 60.");
        } else {
            System.out.println("The average mark is less than 60.");
        }
        
        scanner.close();
    }
}
