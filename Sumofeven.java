// Sum of Even Numbers in a Given Array

class Sumofeven 
{
    public static void main(String[] args) 
{
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
