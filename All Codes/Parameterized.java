class Employee
{
    String name;
    int id;

    public Employee()
    {
        name = "Jaimin";
        id = 2133;
    }
    public void display()
    {
        System.out.println("Enter employee name:"+name);
        System.out.println("Enter employee id:"+id);
    }
}
public class Parameterized 
{
    public static void main(String[] args) 
    {
        Employee e = new Employee();
        e.display();
    }
}
