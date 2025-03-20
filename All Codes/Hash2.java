
import java.util.HashMap;

//HashMap
public class Hash2 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Rohit Sharma");
        hm.put(2, "Virat Kohli");
        hm.put(3, "MS Dhoni");
        hm.put(4, "Jasprit Bumrah");
        hm.put(5, "hardik Pandiya");
        System.out.println("HashMap 1 is:"+hm);
        hm.remove(5);
        System.out.println("Hashmap 2 is:"+hm);
        System.out.println("Check:"+hm.containsKey(1));
        System.out.println("Value at 2:"+hm.get(2));
    }
}
