public class _05_AreaOfEquilateralTriangle 
{
    public static double calc(double arm)
    {
        return (Math.sqrt(3) / 4.00) * Math.pow(arm, 2);
    }
    public static void main(String args[])
    {
        double arm = 10.5;
        double area = calc(arm);

        System.out.print("The Area of Equilateral Triangle is: " + area);

    }
}
