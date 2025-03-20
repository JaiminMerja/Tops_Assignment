
import java.util.LinkedList;

//LinkedList
public class List2 
{
    public static void main(String[] args) 
    {
        LinkedList<String> l = new LinkedList<>();
        l.add("Pirates of Carrbian");
        l.add("Harry Potter");
        l.add("Mission Impossible");
        l.add("James Bond");
        System.out.println("Linked list 1 is:"+l);
        System.out.println("Value at 3 is: "+l.get(0));
        l.addFirst("Dark");
        l.addLast("1899");
        System.out.println("Linked List 2:"+l);
        l.remove(4);
        System.out.println("After removing 4 is:"+l);
    }
}
