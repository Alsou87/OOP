package OOP_calk;
public class Umn extends Operation {
    public Umn(double a, double b, String operation1) {
        super(a, b, operation1);
    }

    public Umn(Operation operation) {
        getA();
        getB();
    }

    public double doUmn(){
        return getA() * getB();
    }
    @Override
    public String toString() {
        return "Перемножение чисел = " + doUmn();
    }
}