import java.util.Scanner;

public class _04_FindingGreatestNumber 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int maximum = Integer.MIN_VALUE;
        System.out.println("Enter All the Numbers: ");
        for(int i = 0; i < n; ++i)
        {
            arr[i] = input.nextInt();
            maximum = Math.max(arr[i], maximum);
        }
        System.out.println("The Greatest Number of the Array is: " + maximum);
    }
}
