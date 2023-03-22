class promotion{

    void sum(int a, float b)
    {
        System.out.println(a*b);
    }
    void sum(double d)
    {
        System.out.println(d+10);
    }
}

public class forced_type_promotion {

    public static void main(String args[])
    {
        promotion promote = new promotion();

        promote.sum(1.25);
        promote.sum(12, 12);
        
    }
    
}
