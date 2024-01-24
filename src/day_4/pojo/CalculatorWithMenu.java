package day_4.pojo;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu{

    private final CalculatorOperations calculator = new Calculator();
    private final Scanner leer = new Scanner(System.in);

    @Override
    public void menuCalculator() {
        System.out.println("--------Welcome to the calculator--------");
        System.out.println("Choose one of the following options: ");
        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("0- To go out");
    }

    @Override
    public byte operations() {
        short a = 0, b = 0;
        byte option = leer.nextByte();
        if (option == 0 ){
            System.out.println("Bye see you, come back soon");
            return option;
        }
        if (option <5 && option > 0){
            System.out.println("Enter the first number:");
            a = leer.nextShort();
            System.out.println("Enter the second number:");
            b = leer.nextShort();
        }
        switch (option){
            case 1:
                System.out.println("The result of the addition is: " + calculator.addition(a, b));
               break;
            case 2:
                System.out.println("The result of the subtraction is: " + calculator.subtraction(a, b));
                break;
            case 3:
                System.out.println("The result of the multiplication is: " + calculator.multiplication(a, b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("¡Division by 0 is not possible! Try again.");
                    break;
                }
                System.out.println("The result of the division: " + calculator.division(a, b));
                break;
            default:
                System.out.println("¡Invalid option! Try again.");
                break;
        }
        return option;
    }


    @Override
    public byte init(){
        menuCalculator();
        return operations();
    }

}
