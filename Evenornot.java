// Even or not

import java.util.Scanner;

class EvenOrNot {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
        
        scanner.close();
    }
}
