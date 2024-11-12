// Pass or Fail

import java.util.Scanner;

class SubjectsPassorfail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the marks for subject 1: ");
        int s1 = scanner.nextInt();
        System.out.print("Enter the marks for subject 2: ");
        int s2 = scanner.nextInt();
        System.out.print("Enter the marks for subject 3: ");
        int s3 = scanner.nextInt();
        System.out.print("Enter the marks for subject 4: ");
        int s4 = scanner.nextInt();
        System.out.print("Enter the marks for subject 5: ");
        int s5 = scanner.nextInt();
        
        if (s1 >= 30 && s2 >= 30 && s3 >= 30 && s4 >= 30 && s5 >= 30) {
            System.out.println("The student has passed in all 5 subjects.");
        } else {
            System.out.println("The student has not passed in all 5 subjects.");
        }
        
        scanner.close();
    }
}
