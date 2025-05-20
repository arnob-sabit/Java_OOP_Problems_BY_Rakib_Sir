public class _06_AreaOfTriangle2 
{
    public static double calc(double a, double b, double c)
    {
        double s = (a + b + c) / 2.00;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public static void main(String args[])
    {
        double a = 5.0, b = 6.0, c = 7.0;
        double area = calc(a, b, c);

        System.out.println("The Area of Triangle is : " + area);
    }
}
