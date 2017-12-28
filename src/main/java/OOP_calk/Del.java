package OOP_calk;
public class
Del extends Operation {
    public Del(double a, double b, String operation1) {
        super(a, b, operation1);
    }

    public Del(Operation operation) {
        getA();
        getB();
    }

    public double doDel(){
        return getA() / getB();
    }
    @Override
    public String toString() {
        return "Деление чисел = " + doDel();
    }
}