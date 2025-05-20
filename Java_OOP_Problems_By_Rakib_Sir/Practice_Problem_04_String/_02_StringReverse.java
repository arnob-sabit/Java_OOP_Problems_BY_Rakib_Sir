import java.util.Scanner;

public class _02_StringReverse 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed string: ");
        for(int i = input.length()-1; i >= 0; i-- )
        {
            System.out.print(input.charAt(i));
        }

    }
}
