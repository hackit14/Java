import java.util.*;

public class Array_list {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();

        System.out.println("1.Create\n2.Display\n3.Iterate using For Each\n4.Iterate using HasNext()\n5.AddAll\n6.RemoveAll\n7.RetainAll");
        System.out.print("Enter Your Option: ");
        int option = sc.nextInt();

        while (true) {
            switch (option) {
                case 1: {
                    create c = new create();
                    c.create(str);
                    break;
                }
                case 2: {
                    Display d = new Display();
                    d.display(str);
                    break;
                }
                default: {
                    System.out.println("Enter Valid Option.");
                    break;
                }
            }
            System.out.print("Enter Your Option: ");
            option = sc.nextInt();
        }
    }
}

class create {
    public void create(ArrayList<String> str) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;

        while (choice != 0) {
            System.out.print("Enter Data: ");
            String a = sc.next();

            str.add(a);

            System.out.print("1 to Add More, 0 to Exit: ");
            choice = sc.nextInt();
        }
    }
}

class Display {
    public void display(ArrayList<String> str) {
        for (String obj : str) {
            System.out.println(obj);
        }
    }
}
