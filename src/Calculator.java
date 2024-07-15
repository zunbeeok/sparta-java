import exception.CustomException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Double> resultList ;

    Calculator(ArrayList<Double> resultList){
        this.resultList =resultList;
    }

    public List<Double> getResultList() {
        // return resultList; 기존 코드시 컬렉션이 변경되는 위험이 있어 캡슐화가 정상적으로 되지 않음.
        return new ArrayList<>(resultList); // 깊은 복사를 통해 컬렉션을 캡슐화 시킨다.
    }

    public void addResultList(Double result) {
        this.resultList.add(result);
    }

    public void removeResult(){
        this.resultList.removeFirst();
    }

    public void inquiryResults(){
        for(Double result: this.resultList){
            System.out.println(result);
        }
    }

    public Double calculate(double x, double y, char sign){
        double result = 0;
        if(sign == '+'){
            result = x + y;
        } else if (sign == '-') {
            result = x - y;
        }else if (sign == '/'){
            if (y == 0){
                throw new CustomException("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
            }
            result = x / y;
        }else if(sign == '*'){
            result = x * y;
        }else {
            throw new CustomException("연산기호가 잘 못 입력되었습니다.");
        }
        return result;
    }
}
