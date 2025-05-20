import java.util.Scanner;

public class _01_PatternPrinting 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter Number of Rows: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n; ++i)
        {
            for(int j = 1; j <= i; ++j)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
