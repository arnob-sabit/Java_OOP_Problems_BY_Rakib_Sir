class Employee
{
    String name, department;
    int id;
    Employee(String name, int id, String department)
    {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    void calculatePay()
    {
        System.out.println("CalculatePay has been implemented.");
    }
}

class FullTimeEmployee extends Employee
{
    double FixedSalary = 100000.123;
    FullTimeEmployee(String name, int id, String department, double FixedSalary)
    {
        super(name, id, department);
    }

    @Override
    void calculatePay() 
    {
        super.calculatePay();
        System.out.println("The salary is: " + this.FixedSalary);
    }
}

class PartTimeEmployee extends Employee{
    PartTimeEmployee(String name, int id, String department)
    {
        super(name, id, department);
    }
    double hourlyRate = 300.35;
    int hoursWorked = 5;

    @Override
    void calculatePay() 
    {
        super.calculatePay();
        System.out.println("The Salary is: " + this.hourlyRate * this.hoursWorked);
    }
}
class ContractEmployee extends Employee
{
    String projectName;
    double contractAmount;
    ContractEmployee(String name, int id, String department)
    {
        super(name, id, department);
    }
}

public class _08a_Hierarchical 
{
    public static void main(String[] args) {
        Employee ob1 = new Employee("Arnob", 2022831048, "SWE");
        PartTimeEmployee obj2 = new PartTimeEmployee("Hasan", 320, "SS");
        ContractEmployee ob3 = new ContractEmployee("Sabit", 341232, "EEE");
        obj2.hourlyRate = 10000;
        obj2.calculatePay();
        ob3.projectName = "Reference";    ob3.contractAmount = 20000;
        System.out.println("Project Name : " + ob3.projectName + " " + "Contract Amount: " + ob3.contractAmount + " " );
    }
}
