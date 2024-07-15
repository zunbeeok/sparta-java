import exception.CustomException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> resultList =new ArrayList<Double>();

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
