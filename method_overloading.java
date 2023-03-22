/*------------------- METHOD OVERLOADING ------------------------------ */

class area {

    static int find_area(int a,int b){
        return a*b;
    };

    static int find_area(int a){
        return a*4;
    }
}

public class method_overloading{
    public static void main(String args[])
    {
        System.out.println(area.find_area(5));
    }
}