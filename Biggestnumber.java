// Biggest Number in Given Array

class Biggestnumber
 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number in array: " + max);
    }
}
