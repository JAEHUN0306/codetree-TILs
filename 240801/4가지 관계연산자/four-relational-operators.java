import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scannsr sc = new Scannsr(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a >= b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if(a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if(a <= b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if(a < b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}