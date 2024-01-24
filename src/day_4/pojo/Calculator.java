package day_4.pojo;

public class Calculator implements CalculatorOperations{

    @Override
    public short addition(short a, short b) {
        return (short) (a + b);
    }

    @Override
    public short subtraction(short a, short b) {
        return (short) (a - b);
    }

    @Override
    public short multiplication(short a, short b) {
        return (short) (a * b);
    }

    @Override
    public float division(short a, short b) {
        return (float) a / b;
    }
}
