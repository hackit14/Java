/*---------------------TYPE PROMOTION-------------------- */

class area {

    static double find_area(double a,double b){
        return a*b;
    };

    static int find_area(int a,int b){
        return a*b;
    }
}

public class type_promotion{
    public static void main(String args[])
    {
        System.out.println(area.find_area(5,5)); //Int Vaue 

        System.out.println(area.find_area(15.5,20.2)); //Float Value

    }
}