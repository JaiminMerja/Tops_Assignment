package mypackages.Test2;

import mypackages.AcessModifierDemo;

// Access from different packages
public class AcessModifierTest2 
{
    public static void main(String[] args) 
    {
        AcessModifierDemo ad = new AcessModifierDemo();
        System.out.println("Access from Different Packages:");
        System.out.println("Public:"+ad.a);
        // System.out.println("Private:"+ad.b); //Not Accessible
        // System.out.println("Protected:"+ad.c); //Not Accessible
        // System.out.println("Default:"+ad.defaultvar); //Not Accessible
    }
}
