package OOP_calk;
public class Vyuch extends Operation {
    public Vyuch(int a, int b, String operation1) {
        super(a, b, operation1);
    }

    public Vyuch(Operation operation) {
        getA();
        getB();
    }

    public double doVyuch(){
        return getA() - getB();
    }
    @Override
    public String toString() {
        return "Разница чисел = " + doVyuch();
    }
}