import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Double> resultList = new ArrayList<>();

        double result = 0;
        boolean con = true;

        do{
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            double x = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요 : ");
            double y = sc.nextInt();

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
            resultList.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if(sc.next().equals("remove")){
                resultList.removeFirst();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if(sc.next().equals("inquiry")){
                for(Double resultValue : resultList){
                    System.out.println(resultValue);
                }
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();

            if(answer.equals("exit")){
                con = false;
            }
        }while (con );

    }
}
