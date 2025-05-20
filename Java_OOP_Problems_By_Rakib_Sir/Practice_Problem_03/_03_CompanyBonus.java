import java.util.Scanner;

public class _03_CompanyBonus 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Target Sales: ");

        int targetSales = input.nextInt();

        System.out.print("Enter Attendence Rate: ");

        int attendence = input.nextInt();

        int bonus;

        if(targetSales >= 95 && attendence == 100) 
            bonus = 60;
        else if(targetSales >= 95 && attendence >= 90) 
            bonus = 40;
        else if(targetSales >= 80 && attendence == 100) 
            bonus = 40;
        else if(targetSales >= 80 && attendence >= 90) 
            bonus = 20;
        else 
            bonus = 5;

        System.out.println("The Bonus of The Officer is : " + bonus);
    }
}
