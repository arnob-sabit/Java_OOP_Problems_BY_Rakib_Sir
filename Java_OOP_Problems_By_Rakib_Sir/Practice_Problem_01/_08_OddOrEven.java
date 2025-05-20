import java.util.Scanner;

public class _08_OddOrEven 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = input.nextInt();
        if(n % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
