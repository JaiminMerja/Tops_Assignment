import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serializable and Deserializable
class Person implements Serializable
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class File3 
{
    public static void main(String[] args) 
    {
        String s = "f3.txt";
        Person p = new Person("Jimmy",22);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(s)))
        {
            oos.writeObject(p);
            System.out.println("Object Serialized Successfully");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(s)))
        {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Object:");
            deserializedPerson.display();
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
