import java.util.Scanner;

abstract class Critter{
    abstract void behave(int a);
    void getColor() {
        System.out.println("Yellow");
    }
}
public class Butterfly extends Critter{

    void toString(int n ) {
        for(int i=0 ; i<n;i++)
        if(i%2 == 0) {
            System.out.println("x");
        }

            System.out.println("a");
    }

    public static void main(String args[]) {
        Butterfly b = new Butterfly();
        Scanner sc = new Scanner(System.in);
        b.getColor();
        System.out.println("Enter the no. of footprints ");
        int n = sc.nextInt();
        b.toString(n);
        System.out.println("Enter behaviour \n1.fly \n2.sleep");
        int bh = sc.nextInt();
        b.behave(bh);
    }


    void behave(int c) {
        switch(c) {
            case 1:System.out.println("Fly");break;
            case 2:System.out.println("sleep");break;
        }
    }
}

