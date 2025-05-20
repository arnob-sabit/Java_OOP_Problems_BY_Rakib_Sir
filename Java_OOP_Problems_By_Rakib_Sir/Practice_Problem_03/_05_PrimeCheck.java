import java.util.Scanner;

public class _05_PrimeCheck
{
    public static void main(String[] args) 
    {
        System.out.println("Enter The Number: ");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        boolean flag = false;
        for(int i = 1; i < n; ++i)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if(n == 1) 
            System.out.println("Not prime neither composite");
        else if(!flag) 
            System.out.println("Prime");
        else 
            System.out.println("Not Prime");
    }
}
