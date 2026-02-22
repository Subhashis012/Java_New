package Java.Generics;

public class Main2 {
    static void main() {
        NumberBox intBox = new NumberBox();
        intBox.setNumber(10);
        Integer value = (Integer) intBox.getNumber();
        System.out.println(value);
    }
}

class NumberBox {
    private Number number;

    public void setNumber(Number number) {
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }
}
