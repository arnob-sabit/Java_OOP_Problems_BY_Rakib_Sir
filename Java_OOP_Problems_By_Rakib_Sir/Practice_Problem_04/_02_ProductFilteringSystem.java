public class _02_ProductFilteringSystem 
{

    void filterProducts(String category)
    {
        System.out.println("Category: " + category);
    }
    void filterProducts(String brand, boolean isBrand)
    {
        if(isBrand == true)
        {
            System.out.println("Brand: " + brand);
        }
    }
    void filterProducts(int minimumRange, int maximumRange)
    {
        System.out.println("Price Range of the Product: " + minimumRange + " - " + maximumRange);
    }
    void filterProducts(String category, int minimumRange, int maximumRange)
    {
        System.out.println("Category: " + category);
        System.out.println("Price Range of the Product: " + minimumRange + " - " + maximumRange);
    }
    static void filterProducts(String category, String brand, int minimumRange, int maximumRange)
    {
        System.out.println("Category: " + category);
        System.out.println("Price Range of the Product: " + minimumRange + " - " + maximumRange);
        System.out.println("Brand: " + brand);
    }

    public static void main(String[] args) 
    {
        ProductFilteringSystem object = new ProductFilteringSystem();
        
        filterProducts("Fashion", "Nike", 10, 100);
        
        object.filterProducts(10, 100);
    }
}
