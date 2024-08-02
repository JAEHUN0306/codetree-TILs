import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mScore = sc.nextInt();
        int lScore = sc.nextInt();

        if(mScore >= 90) {
            if(lScore >= 95) {
                System.out.println(100000);
            } else if (lScore >= 90) {
                System.out.println(50000);
            }
        }
    }
}