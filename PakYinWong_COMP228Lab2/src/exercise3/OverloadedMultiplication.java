package exercise3;

public class OverloadedMultiplication {
    public static int multiplication (int num1, int num2){
        return num1*num2;
    }
    public static double multiplication (double num1, double num2, double num3){
        return num1*num2*num3;
    }
    public static int multiplication (int [] nums){
        int product = 1;
        for (int num : nums){
            product *= num;
        }
        return product;
    }
}
