import java.util.Scanner;

public class _09_StudentGrade 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter Number: ");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String ans;

        if(n >= 90) ans = "A+";
        else if(n >= 80) ans = "A";
        else if(n >= 70) ans = "A-";
        else if(n >= 60) ans = "B";
        else if(n >= 40) ans = "C+";
        else ans = "F";
        
        System.out.print("Student Grade: " + ans);
    }
}
