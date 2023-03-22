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
class cat extends dog{
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
        dog obj = new walk();

        obj.walk();
    }
    
}
