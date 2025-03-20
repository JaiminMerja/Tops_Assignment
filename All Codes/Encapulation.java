class Person
{
    String name, schoolname;
    int rollnumber;

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getSchoolname() 
    {
        return schoolname;
    }
    public void setSchoolname(String schoolname) 
    {
        this.schoolname = schoolname;
    }
    public int getRollnumber() 
    {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber) 
    {
        this.rollnumber = rollnumber;
    }
    
}
public class Encapulation 
{
    public static void main(String[] args) 
    {
        Person p = new Person();
        p.setName("Jack Sparrow");
        p.setSchoolname("Pirates of Carbbian");
        p.setRollnumber(1);
        System.out.println("Name is Captain"+p.getName());
        System.out.println("School name is:"+p.getSchoolname());
        System.out.println("Roll Number is:"+p.getRollnumber());
    }
}
