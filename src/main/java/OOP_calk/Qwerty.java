//основная программа
package OOP_calk;
import java.util.Scanner;
public class Qwerty {
    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.println(operation.toString());
        Sum sum = new Sum(operation.getA(),operation.getB(),operation.getOperation1());
        Vyuch vyuch = new Vyuch(operation.getA(),operation.getB(),operation.getOperation1());
        Umn umn = new Umn(operation.getA(),operation.getB(),operation.getOperation1());
        Del del = new Del(operation.getA(),operation.getB(),operation.getOperation1());

        if (operation.getOperation1().equals("1")) {
            System.out.println(sum.toString());
            }if (operation.getOperation1().equals("2")){
            System.out.println(vyuch.toString());
            }if (operation.getOperation1().equals("4")){
            System.out.println(umn.toString());
            }if (operation.getOperation1().equals("3")){
            System.out.println(del.toString());
        }

    }
}