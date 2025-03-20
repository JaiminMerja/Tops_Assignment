package mypackages;

// Access in same Packages
public class AccessModifierTest 
{
    public static void main(String[] args) 
    {
        AcessModifierDemo ad = new AcessModifierDemo();
        System.out.println("Access from Different Packages:");
        System.out.println("Public:"+ad.a);
        // System.out.println("Private:"+ad.b); //Not Accessible
        System.out.println("Protected:"+ad.c);
        System.out.println("Default:"+ad.defaultvar);
    }
}
