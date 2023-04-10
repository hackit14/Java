import java.util.*;

public class Priorityqueue {
    
    public static void  main(String args[])
    {
        PriorityQueue<String> str = new PriorityQueue<>();

        str.add("ME");
        str.add("YOU");
        str.add("US");
        str.add("WE");

        Iterator it  = str.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        for(String a: str)
        {
            System.out.println(a);

        }
    }
}
