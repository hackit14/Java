import java.util.*;

public class AL_addall {

    public static void main(String args[])
    {
        ArrayList<String> str = new ArrayList<>();

        str.add("ME");
        str.add("YOU");
        str.add("US");
        str.add("WE");

        /*for(String a:str)
        {
            System.out.println(a);
        }*/

        ArrayList<String> str1 = new ArrayList<>();

        str1.addAll(str);

        for(String a:str1)
        {
            System.out.println(a);
        }


    }
    
}
