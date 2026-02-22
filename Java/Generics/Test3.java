package Java.Generics;

enum Operation {
    Add,
    Sub,
    Mul,
    Div;

    public <T extends Number> double apply(T a, T b) {
        switch (this) {
            case Add:
                return a.doubleValue() + b.doubleValue();
            case Sub:
                return a.doubleValue() - b.doubleValue();
            case Mul:
                return a.doubleValue() * b.doubleValue();
            case Div:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new AssertionError("Unknown operation" + this);
        }
    }
}

public class Test3 {
    static void main() {
        double res1 = Operation.Add.apply(10, 20);
        System.out.println(res1);
        double res2 = Operation.Sub.apply(10, 20);
        System.out.println(res2);
        double res3 = Operation.Mul.apply(10, 20);
        System.out.println(res3);
        double res4 = Operation.Div.apply(10, 20);
        System.out.println(res4);
    }
}
