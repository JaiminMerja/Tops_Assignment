//remove duplicates from HashSet 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Hash1 
{
    public static void main(String[] args) 
    {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,4,2,3,8,9,8));
        HashSet<Integer> set = new HashSet<Integer>(l1);
        List<Integer> l2 = new ArrayList<Integer>(set);
        System.out.println("List after duplicates are remove:");
        for(Integer num : l2)
        {
            System.out.println(num);
        }
    }
}
