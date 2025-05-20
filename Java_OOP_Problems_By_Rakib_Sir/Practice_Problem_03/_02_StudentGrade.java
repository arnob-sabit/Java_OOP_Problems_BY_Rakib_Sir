import java.util.Scanner;

public class _02_StudentGrade 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter CGPA: ");

        float n = input.nextFloat();

        System.out.println("Has He Completed The Semester?(Write true/ false) :");

        boolean flag = input.nextBoolean();

        if(!flag) 
            System.out.println("NO Letter Grade");
        else if(n >= 3.5) 
            System.out.println("Letter Grade");
        else 
            System.out.println("NO Letter Grade");
    }
}
