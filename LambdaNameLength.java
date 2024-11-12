        // Lambda expression to calculate the length of a name

public class LambdaNameLength 

{
    public static void main(String[] args) 
{

        NameLength nameLength = (name) -> name.length();

        String myName = "ShashikanthDavuluri";
        int length = nameLength.getLength(myName);

        System.out.println("The length of the name \"" + myName + "\" is: " + length);
    }

    // Functional interface with a method to get the length of a name
    @FunctionalInterface
    interface NameLength {
        int getLength(String name);
    }
}
