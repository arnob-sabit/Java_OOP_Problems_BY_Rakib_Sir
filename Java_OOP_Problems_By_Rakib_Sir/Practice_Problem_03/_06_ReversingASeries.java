import java.util.Scanner;

public class _06_ReversingASeries 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Elements: ");
        for(int i = 0; i < n; ++i)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Reversed Array: ");
        for(int i = n - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
