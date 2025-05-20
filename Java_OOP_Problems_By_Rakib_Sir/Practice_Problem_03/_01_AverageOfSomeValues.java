import java.util.Scanner;

public class _01_AverageOfSomeValues 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter Number of Elements: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("\nEnter Elements: ");
        int sum = 0;
        float ans = 0;
        for(int i = 0; i < n; ++i)
        {
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        ans = (float)sum / (float)n;
        System.out.println("The average is: " + ans);
    }
}
