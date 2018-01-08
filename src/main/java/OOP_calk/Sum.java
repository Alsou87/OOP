package OOP_calk;
public class Sum extends Operation {
        public Sum(int a, int b, String operation1) {
            super(a, b, operation1);
        }

        public Sum(Operation operation) {
            getA();
            getB();
        }

        public double doSum(){
            return getA() + getB();
        }
       @Override
        public String toString() {
            return "Сумма чисел равна = " + doSum();
        }
    }