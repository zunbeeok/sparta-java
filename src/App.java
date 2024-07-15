import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int x = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요 : ");
        int y = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요 : ");
        char sign = sc.next().charAt(0);

    }
}
