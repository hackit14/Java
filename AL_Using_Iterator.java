import java.util.*;

public class AL_Using_Iterator {

    public static void main(String args[])
    {
        ArrayList<String> str = new ArrayList<>();

        str.add("ME");
        str.add("YOU");
        str.add("US");
        str.add("WE");

        Iterator it = str.iterator();
        while(it.hasNext()){
         System.out.println(it.next());
        }


    }
    
}
