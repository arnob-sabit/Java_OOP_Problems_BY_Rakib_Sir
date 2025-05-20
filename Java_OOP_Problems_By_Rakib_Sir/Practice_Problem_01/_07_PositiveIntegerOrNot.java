import java.util.Scanner;

public class _07_PositiveIntegerOrNot 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = input.nextInt();
        if(n >= 0) System.out.println("Positive");
        else System.out.println("Negative");
    }
}
