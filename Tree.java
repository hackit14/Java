import java.util.*;


public class Tree {

    public static void main(String args[])
    {
        TreeSet<String> str = new TreeSet<>();

        str.add("ME");
        str.add("YOU");
        str.add("US");
        str.add("WE");

        Iterator it =str.descendingIterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        TreeSet<String> str1 = new TreeSet<>();

        str1.addAll(str);
        str1.add("MAYBE");
        Iterator it2 =str1.descendingIterator();

        


        while(it2.hasNext())
        {
            System.out.println(it2.next());
        }

        //Conditions
        System.out.println(str1.containsAll(str)); //True
        System.out.println(str1.contains("HELLO"));  //False
        System.out.println(str1.contains("MAYBE"));  //True
        System.out.println(str1.retainAll(str));  //True
    }
    
}
