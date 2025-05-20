import java.util.Scanner;

public class _07_OddEvenCount 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Elements: ");
        int oddCount = 0;
        for(int i = 0; i < n; ++i)
        {
            arr[i] = input.nextInt();
            if(arr[i] % 2 != 0) oddCount++;
        }
        System.out.println("Odd Count: " + oddCount + "\nEven Count: " + (n - oddCount));
    }
}
