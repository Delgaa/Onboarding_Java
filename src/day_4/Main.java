package day_4;

import day_4.pojo.CalculatorWithMenu;

public class Main {
    public static void main(String[] args) {
        CalculatorWithMenu calculator = new CalculatorWithMenu();
        byte option;
        do {
            option = calculator.init();
        }while (option != 0);
    }
}
