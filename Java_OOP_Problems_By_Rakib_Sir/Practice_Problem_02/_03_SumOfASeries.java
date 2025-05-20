// Sum of two series : 
// 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
// 1, 3, 5, 7, 9, 11, 13, 15, 17, 19

// Calculating the sum of two series Using Loops


public class _03_SumOfASeries 
{
    public static void main(String[] args) 
    {
        int i = 1, sumEven = 0, sumOdd = 0;
        for(i = 1; i <= 20; i += 2)
        {
            sumOdd += i;
        }
        System.out.println("Sum Of Odd Series: " + sumOdd);
        int j = 2;
        while(j <= 20)
        {
            sumEven += j;
            j += 2;
        }
        System.out.println("Sum Of Even Series: " + sumEven);
    }
}
