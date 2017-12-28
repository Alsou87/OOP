package OOP_calk;

import java.util.Scanner;
//родительский класс
public class Operation {
    private double a;
    private double b;
    private String operation1;

    public Operation(double a, double b, String operation1) {
        this.a = a;
        this.b = b;
        this.operation1 = operation1;
    }

    public Operation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-ое число:");
        a = scanner.nextDouble();
        System.out.println("Введите 2-ое число:");
        b = scanner.nextDouble();
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

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String getOperation1() {
        return operation1;
    }

    public void setOperation1(String operation1) {
        this.operation1 = operation1;
    }
}
