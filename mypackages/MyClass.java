package mypackages;

public class MyClass 
{
    
    String name,movietype;
    int rating;
    public void showMessage()
    {
        name="Pushpa";
        movietype="Action & Romance";
        rating=5;
    }
    public void display()
    {
       System.out.println("Movie name:"+name);
       System.out.println("Movie Type is:"+movietype);
       System.out.println("Rating is:"+rating);
    }
}
