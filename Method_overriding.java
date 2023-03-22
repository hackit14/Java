class dog{
     void walk()
     {
        System.out.println("Barking...");
     }
     void run()
    {
        System.out.println("Running...");
    }
}
class cat{
    void walk()
    {
        System.out.println("Meows...");
    }
    
}
class walk extends cat{
    void walk()
    {
        System.out.println("Both DOG & CAT walks...");
    }
}

public class Method_overriding {

    public static void main(String args[])
    {
        dog dg = new dog();
        cat ct = new cat();
        walk wlk = new walk();

        wlk.walk();
        dg.walk();
        dg.run();
        ct.walk();
    }
    
}
