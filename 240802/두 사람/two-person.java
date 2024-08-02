import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 사람의 나이와 성별 입력 받기
        int age1 = scanner.nextInt();
        String gender1 = scanner.next();
        
        // 두 번째 사람의 나이와 성별 입력 받기
        int age2 = scanner.nextInt();
        String gender2 = scanner.next();
        
        // 조건 검사
        if ((age1 >= 19 && gender1.equals("M")) || (age2 >= 19 && gender2.equals("M"))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}