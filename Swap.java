//Swap First and Last Elements of the Array

class Swap 
{
    public static void main(String[] args) 
{
        int[] array = {1, 2, 3, 4, 5};
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.print("Array after swapping first and last: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
