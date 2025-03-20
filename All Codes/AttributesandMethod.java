class Student {

    String name;
    int age;

    public void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public class AttributesandMethod 
    {
    public static void main(String[] args) 
    {
        Student s = new Student();
        s.name = "John Doe";
        s.age = 20;
        s.displayDetails();
    }
    }
}
