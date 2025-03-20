package mypackages;

public class AcessModifierDemo 
{
    public String a = "This is a public access modifier";
    private String b = "This is a private access modififer";
    protected String c = "This is a protected access modifier";
    String defaultvar = "This is Default";

    public void show()
    {
        System.out.println("Access Modidifer");
        System.out.println("Public:"+a);
        System.out.println("Private:"+b);
        System.out.println("Protected:"+c);
        System.out.println("Default:"+defaultvar);
    }
}
