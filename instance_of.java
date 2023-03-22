class print {

}

class show extends print {

}

public class instance_of extends show {
    public static void main(String args[]) {
        
        // object Creation
        show sh = new show();
        instance_of ints = new instance_of();

        System.out.println(sh instanceof print); // Returns TRUE due to Show Extends Print
        System.out.println(sh instanceof show);

        System.out.println(sh instanceof instance_of); // show doesn't extends instance_of class -------- so FALSE

        System.out.println(ints instanceof show); // instance_of class extends show---- so True

        ints = null;
        System.out.println(ints instanceof instance_of); // Returns False due to NULL

    }

}
