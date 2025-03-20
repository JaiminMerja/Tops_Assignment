
import java.util.ArrayList;
import java.util.Iterator;

// ArrayList
public class List1 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println("ArrayList is:"+a);
        a.addFirst(0);
        a.addLast(6);
        System.out.println("ArrayList 2 is:"+a);
        System.out.println("ArrayList 3 is:"+a.contains(9));
        Iterator i = a.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
