     // Lambda expression to calculate the multiplication of two numbers

public class LambdaMultiplication 
{
    public static void main(String[] args) 
{
   
        Multiply multiply = (a, b) -> a * b;

        int num1 = 6;
        int num2 = 8;
        int result = multiply.multiply(num1, num2);

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
    }

  
    interface Multiply 
{
        int multiply(int a, int b);
    }
}
