import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int AMath = sc.nextInt();
        int AEng = sc.nextInt();
        
        int BMath = sc.nextInt();
        int BEng = sc.nextInt();

        if (AMath > BMath) {
            System.out.println("A");
        } else if (AMath == BMath) {
            if(AEng > BEng) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } 
        
        else {
            System.out.println("B");
        }
    }
}