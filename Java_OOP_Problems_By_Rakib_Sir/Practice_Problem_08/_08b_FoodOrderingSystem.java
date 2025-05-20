class Restaurant
{
    int estimateDeliveryTime()
    {
        return 40;
    }
    double billRate(int bill)
    {
        return bill + (bill * (.1));
    }
    void displayInfo(String name, int bill)
    {
        System.out.println(name + " estimated delivery time: " + estimateDeliveryTime() + " minutes");
        System.out.println(name + " estimated Bill Rate: " + billRate(bill) + " taka");
    }
}
class FastFoodRestaurant extends Restaurant
{
    @Override
    double billRate(int bill) 
    {
        return bill + (bill * (.15));
    }

    @Override
    int estimateDeliveryTime() 
    {
        return 20;
    }
}
class FineDiningRestaurant extends Restaurant
{
    @Override
    int estimateDeliveryTime() 
    {
        return 60;
    }
}
public class _08b_FoodOrderingSystem 
{
    public static void main(String[] args) 
    {
        Restaurant genericRestaurant = new Restaurant();
        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        FineDiningRestaurant fineDining = new FineDiningRestaurant();

        genericRestaurant.displayInfo("Normal", 10);
        fastFood.displayInfo("Fast-Food", 10);
    }
}
