import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A_age = sc.nextInt();
        char A_gen = sc.next().charAt(0);
        int B_age = sc.nextInt();
        char B_gen = sc.next().charAt(0);

        if (A_age >= 19 && A_gen == 'M' || B_age >= 19 && B_age == 'M') {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}