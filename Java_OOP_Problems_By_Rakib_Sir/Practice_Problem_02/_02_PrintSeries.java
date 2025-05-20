
//Generating two series : 
// 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
// 1, 3, 5, 7, 9, 11, 13, 15, 17, 19

public class _02_PrintSeries 
{
    public static void main(String[] args) 
    {
        int i = 1;
        System.out.print("Odd Series: ");
        for(i = 1; i <= 20; i += 2)
        {
            System.out.print(i + " ");
        }

        System.out.println("");

        int j = 2;
        System.out.print("Even Series: ");
        while(j <= 20)
        {
            System.out.print(j + " ");
            j += 2;
        }
    }
}
