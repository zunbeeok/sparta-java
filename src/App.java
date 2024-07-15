import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] list= new int[10];
        int index = 0;

        int result = 0;
        boolean con = true;

        do{
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            int x = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요 : ");
            int y = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 : ");
            char sign = sc.next().charAt(0);

            if(sign == '+'){
                result = x + y;
            } else if (sign == '-') {
                result = x - y;
            }else if (sign == '/'){
                if (y == 0){
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                    continue;
                }
                result = x / y;
            }else if(sign == '*'){
                result = x * y;
            }else {
                System.out.println("연산기호가 잘 못 입력되었습니다.");
                continue;
            }

            System.out.println("결과: " + result);
            if (index== 10){
                list[0] = result;
                index = 0;
            }else {
                list[index] = result;
                index ++;
            }



            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();

            if(answer == "exit"){
                con = false;
            }
        }while (con );

    }
}
