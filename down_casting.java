class dog{
    
}

class eat extends dog {
    void method(dog d)
    {
        eat et = (eat) d;
        if(et instanceof eat)
        {
            System.out.println("Down-Cast Succesful...");
        }
    }
}

public class down_casting {
    public static void main(String args[]){

        eat et = new eat();
        et.method(et);
    }
    
}
