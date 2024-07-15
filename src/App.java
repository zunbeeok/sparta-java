import exception.CustomException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        double result = 0;
        boolean con = true;

        do{
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            double x = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요 : ");
            double y = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);

            try{
                result = cal.calculate(x,y,operator);
            }catch (CustomException e){
                System.out.println(e.getMessage());
            }

            System.out.println("결과: " + result);
            cal.addResultList(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if(sc.next().equals("remove")){
                cal.getResultList().removeFirst();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if(sc.next().equals("inquiry")){
                for(Double resultValue : cal.getResultList()){
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
