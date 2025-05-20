class CarProperties 
{
    String owner, brand;
    int serial, fuel;
    boolean running = false;

    CarProperties(String owner, String brand, int serial)
    {
        this.owner = owner;
        this.brand = brand;
        this.serial = serial;
        this.fuel = 100;
        this.running = false;
    }

    public void start()
    {
        if(running)
        {
            System.out.println("Already Running");
        }
        else
        {
            if(this.fuel <= 0)
            {
                System.out.println("Not Sufficient Fuel");
            }
            else 
            {
                running = true;
                this.fuel -= 50;
                System.out.println("Started");
            }
        }
    }
    public void stop()
    {
        if(!running)
        {
            System.out.println("Already in rest");
        }
        else
        {
            running = false;
        }
    }
    public void fuelLevel()
    {
        System.out.println(this.fuel);
    }
}
class _01_CarProperties 
{
    public static void main(String[] args) 
    {
        CarProperties car1 = new CarProperties("Labib", "Primio", 34123383);
        car1.start();
        car1.stop();
        car1.start();
        car1.fuelLevel();
    }
}
