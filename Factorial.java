// Factorial of Each Number in the Given Array

class Factorial
 {
    public static void main(String[] args) {
        int[] array = {3, 4, 5};
        for (int num : array) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}
