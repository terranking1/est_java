package day0613.day0613_5;

public class Calculator {
    private static final double PI = 3.14159;

    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle 메서드 실행");
        return PI * r * r;
    }

    void say() {
        System.out.println("This is Calculator");
    }
}
