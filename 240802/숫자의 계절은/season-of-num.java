import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        if(m >= 3 || m <= 5) {
            System.out.println("Spring");
        } else if (m <= 8) {
            System.out.println("Summer");
        } else if (m <= 11) {
            System.out.println("Fall");
        } else if (m == 12 || m <= 2) {
            System.out.println("Winter");
    }
}