import java.util.Scanner;

class Coin{
    void setvalue(int val)
    {
        System.out.println(val);
    }
}
class Note{
    void setvalue(int val)
    {
        System.out.println(val);
    }
}

public class Bag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        String[] curr = new String[size*2];
        int[] c_val = new int[size*2];
        int[] n_val = new int[size*2];

        for (int i = 0; i < curr.length; i++) {
            curr[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < curr.length; i++) {
            if (curr[i].equals("coin") || curr[i].equals("Coins") || curr[i].equals("COINS") || curr[i].equals("Coin") || curr[i].equals("COIN")) {
                c_val[i/2] = Integer.parseInt(curr[i+1]);
            }
            if (curr[i].equals("note") || curr[i].equals("Notes") || curr[i].equals("NOTES") || curr[i].equals("Note") || curr[i].equals("NOTE")) {
                n_val[i/2] = Integer.parseInt(curr[i+1]);
            }
        }

        System.out.println("Coins:");
        for (int i = 0; i < c_val.length; i++) 
        {
            if(c_val[i]!=0)
            {
                Coin c = new Coin();
                c.setvalue(c_val[i]);
            }
            
        }

        System.out.println("Notes:");
        for (int i = 0; i < n_val.length; i++) 
        {
            if(n_val[i]!=0)
            {
                Note n = new Note();
                n.setvalue(n_val[i]);
            }
            
        }
    }
}
