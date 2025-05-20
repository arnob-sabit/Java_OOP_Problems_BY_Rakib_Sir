import java.util.Scanner;

public class _10_SimpleCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = scan.nextInt();

        System.out.print("Enter Second Number: ");
        int b = scan.nextInt();

        System.out.print("Enter Operator(+, -, *, /): ");
        char ch = scan.next().charAt(0);
        
        if (ch == '+')
        {
            System.out.println(a + b);
        }
        else if (ch == '-')
        {
            System.out.println(a - b);
        }
        else if (ch == '*')
        {
            System.out.println(a * b);
        }
        else if (ch == '/')
        {
            if (b != 0)
            {
                System.out.println(a / b);
            }
            else
            {
                System.out.println("Error: Division by zero");
            }
        }
        else
        {
            System.out.println("Invalid operator");
        }
    }
}
