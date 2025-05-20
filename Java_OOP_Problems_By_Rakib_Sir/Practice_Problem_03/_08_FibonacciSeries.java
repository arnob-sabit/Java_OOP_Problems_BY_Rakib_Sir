import java.util.Scanner;

public class _08_FibonacciSeries 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter Number of Elements to be Shown: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0, b = 1;
        System.out.println("Fibonacci Series: ");
        for(int i = 0; i < n; ++i)
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
