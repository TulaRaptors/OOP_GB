import java.util.List;

public class Calc <T extends Number> {
    public Double sum(List<T> nums){
        double sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i).doubleValue();
        }
        return sum;
    }

    public Double subtraction(T num1,T num2){
        return num1.doubleValue() - num2.doubleValue();
    }
    public Double multiply(T num1,T num2){
        return num1.doubleValue() * num2.doubleValue();
    }
    public Double div(T num1,T num2){
        return num1.doubleValue() / num2.doubleValue();
    }
    public Integer bynaryTranslation(T num){
        Integer original = num.intValue();
        String bin = "";
        int i = 1;
        while(original != 0) {
            bin += original % 2;
            original /= 2;
        }
        Integer res = Integer.parseInt(bin);
        return res;
    }
}
