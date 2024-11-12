// Prime Numbers in the Array

class PrimeNumbers 
{
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7};
        System.out.print("Prime numbers in array: ");
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
