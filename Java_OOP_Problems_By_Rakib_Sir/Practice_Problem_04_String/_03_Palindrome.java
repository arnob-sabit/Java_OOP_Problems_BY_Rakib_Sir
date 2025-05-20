import java.util.Scanner;

public class _03_Palindrome 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        int n = str.length();
        boolean flag = true;

        for(int i = 0, j = n-1; i < j; i++,j--)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                flag = false;
                break;
            }
        }

        if(!flag)
            System.out.println("The string is not a palindrome.");
        else
            System.out.println("The string is a palindrome.");
    }
}
