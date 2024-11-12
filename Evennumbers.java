// Even Numbers in the Array

class Evennumbers 
{
    public static void main(String[] args) 
{
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 16, 18 };
        System.out.print("Even numbers in array: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
