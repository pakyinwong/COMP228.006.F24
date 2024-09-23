package exercise3;

public class Main {
    public static void main(String[] args) {
       int method1 = OverloadedMultiplication.multiplication(3,5);
       double method2 = OverloadedMultiplication.multiplication(3.2,4.3,5.4);
       int[] array = {3, 5, 7};
       int method3 = OverloadedMultiplication.multiplication(array);
       System.out.println(method1);
       System.out.println(method2);
       System.out.println(method3);
    }
}
