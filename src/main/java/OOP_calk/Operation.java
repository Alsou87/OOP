package OOP_calk;

import java.util.Scanner;
//родительский класс
public class Operation {
    private int a;
    private int b;
    private String operation1;

    public Operation(int a, int b, String operation1) {
        this.a = a;
        this.b = b;
        this.operation1 = operation1;
    }

    public Operation() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-ое число:");
        a = scanner.nextInt();
        System.out.println("Введите 2-ое число:");
        b = scanner.nextInt();
        System.out.println("Выберите операцию: ");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Деление");
        System.out.println("4 - Умножение");
        operation1 = scanner.next();
        scanner.close();
    }

    @Override
    public String toString() {
        return "******************************************";
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getOperation1() {
        try {return operation1; }
        catch (ArithmeticException e) {}

        return null;
    }

    public void setOperation1(String operation1) {
        this.operation1 = operation1;
    }
}