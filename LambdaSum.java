// Lambda expression to calculate the sum of two numbers

public class LambdaSum 
{
    public static void main(String[] args) 
{
        
        Sum sum = (a, b) -> a + b;

        int num1 = 5;
        int num2 = 10;
        int result = sum.add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
interface Sum 
{
        int add(int a, int b);
}

}
