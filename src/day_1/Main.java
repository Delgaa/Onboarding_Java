package day_1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer =new Scanner(System.in);
        // Point 1
        System.out.println("Enter your name:");
        String name = leer.next();

        System.out.println("Enter your lastname:");
        String lastName = leer.next();

        System.out.println("Enter your age:");
        byte age = leer.nextByte();

        System.out.println("Hello, my name is " + name + " " + lastName + " and. I am " + age + " years old");

        // Point 2
        messageWelcome(name);

        // Point 3
        System.out.println("Enter three numbers to see the largest");
        System.out.println("Enter first number");
        short number1 = leer.nextShort();
        System.out.println("Enter second number");
        short number2 = leer.nextShort();
        System.out.println("Enter third number");
        short number3 = leer.nextShort();

        numberLargest(number1, number2, number3);

        // Point 4
        System.out.println("Enter a number to see its parity:");
        short number = leer.nextShort();
        numberParity(number);

        // Point 5
        System.out.println("Enter two strings to compare them:");
        System.out.println("Enter first string");
        String phrase1 = leer.next();
        System.out.println("Enter second string");
        String phrase2 = leer.next();
        if (phrase1.equals(phrase2)) {
            System.out.println("The entered phrases are equals.");
        }else {
            System.out.println("The entered phrases are not equals.");
        }

        // Point 6
        System.out.println("Enter a number to see if it is prime or not: ");
        short numberPrim= leer.nextShort();
        System.out.println(numberPrime(numberPrim));

        // Point 7
        System.out.println("How many numbers will you enter for the addition of odd numbers?");
        byte index = leer.nextByte();
        int[] numbersForOdd = new int[index];
        System.out.println("The sum of the odd numbers is: " + sumNumbersOdd(numbersForOdd, leer));

        // Point 8
        System.out.println("How many numbers are you going to enter to show the pairs and to do the sum of prime numbers?");
        byte index1 = leer.nextByte();
        int[] numbersEvensPrimes = new int[index1];
        sumEvensPrimes(numbersEvensPrimes, leer);

        // Points 9 y 10
        calculator(leer);

        // Points 11 y 12
        manageBowling(leer);
    }
    public static void messageWelcome(String name){
        System.out.println("Welcome " + name + " good to see you again.");
    }
    public static void numberLargest(short number1, short number2, short number3){
        if (number1 == number2 && number2 == number3) {
            System.out.println("The numbers are equals");
        }
        if (number1 > number2 && number1 > number3) {
            System.out.println("The largest number is: " + number1);
        }
        if (number1 < number2 && number2 > number3){
            System.out.println("The largest number is: " + number2);
        }
        if (number1 < number3 && number2 < number3){
            System.out.println("The largest number is: " + number3);
        }
    }
    public static void numberParity(short number) {
        if (number % 2 == 0) {
            System.out.println("The " +number+ " is even");
        }else{
            System.out.println("The " + number + " is odd");
        }
    }
    public static String numberPrime(short number){
        for (short i = 2; i < number; i++ ){
            if(number % i == 0){
                return "The number " + number + " not is prime";
            }
        }
        return "The number " + number + " is prime";
    }
    public static int sumNumbersOdd(int[] numbers, Scanner leer){
        int sum = 0;
        for (int i = 0 ; i < numbers.length; i++){
            System.out.println("Enter number: ");
            numbers[i] = leer.nextInt();
            if (numbers[i] % 2 != 0){
                sum += numbers[i];
            }
        }
        return sum;
    }
    public static boolean isPrimes(boolean prime, int numberArray){
        for (int i = 2; i < numberArray; i++ ){
            if (numberArray % i == 0) {
                prime = false;
                i = numberArray;
            }
        }
        return prime;
    }
    public static void sumEvensPrimes (int[] numbers, Scanner leer){
        int sumPrimes = 0;
        boolean isPrime;
        for (int i = 0 ; i < numbers.length; i++){
            System.out.println("Enter number: ");
            numbers[i] = leer.nextInt();

        }
        System.out.println("The array entered is" + Arrays.toString(numbers));
        System.out.print("Is Evens: ");
        for (int number: numbers) {
            isPrime = true;
            if (number % 2 == 0){
                System.out.print( number + " ");
            }
            isPrime = isPrimes(isPrime, number);

            if (isPrime){
                sumPrimes += number;
            }
        }
        System.out.println("\nThe sum of the prime numbers is: " +sumPrimes);
    }
    public static void printMenu(){
        System.out.println("--------Welcome to the calculator--------");
        System.out.println("Choose one of the following options: ");
        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("0- To go out");
    }
    public static void calculator(Scanner leer){
        short a = 0, b = 0;
        byte option;
        printMenu();
        option = leer.nextByte();
        while (option != 0){
            if (option < 4 && option > 0){
                System.out.println("Enter the first number:");
                a = leer.nextShort();
                System.out.println("Enter the second number:");
                b = leer.nextShort();
            }
            switch (option) {
                case 1:
                    System.out.println("The result of the addition is: " + (a + b));
                    break;
                case 2:
                    System.out.println("The result of the subtraction is: " + (a - b));
                    break;
                case 3:
                    System.out.println("The result of the multiplication is: " + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("¡Division by 0 is not possible!");
                        break;
                    }
                    System.out.println("The result of the division: " + (a / b));
                    break;
                default:
                    System.out.println("¡Invalid option!");
                    break;
            }
            printMenu();
            option = leer.nextByte();
        }
        System.out.println("Bye see you, come back soon");
    }
    public static void menuBowling() {
        System.out.println("--------Welcome to bowling ticket management--------");
        System.out.println("Choose one of the following options: ");
        System.out.println("1- Data entry.");
        System.out.println("2- Available capacity.");
        System.out.println("3- Money raised.");
        System.out.println("4- Log out of the system.");
    }
    public static void manageBowling(Scanner leer){

        byte option;
        short moneyRaised = 0, capacity = 500, countPerson = 0, price;
        do{
            menuBowling();
            option = leer.nextByte();
            switch (option){
                case 1:
                    price =  data(leer);
                    if (price != 0){
                        countPerson++ ;
                        moneyRaised += price;
                        break;
                    }
                    break;
                case 2:
                    if (capacity == countPerson) {
                        System.out.println("¡There are no sites available!");
                        break;
                    }
                    System.out.println("The number of people is: " + (countPerson) + "\n");
                    System.out.println("The available capacity is: " + (capacity - countPerson) + "\n");
                    break;
                case 3:
                    System.out.println("The amount of money raised is: $" + moneyRaised + "\n");
                    break;
                case 4:
                    System.out.println("Closing session..");
                    break;
                default:
                    System.out.println("Incorrect option! Try again\n");
                    break;
            }

        }while (option != 4);
    }
    public static short data(Scanner leer) {
        short vip = 2000, normal = 1500;
        System.out.println("Enter your name:");
        String name = leer.next();
        System.out.println("Welcome " + name + ". Enter your age: ");
        byte age = leer.nextByte();
        if (age < 21) {
            System.out.println("You are under 21. Access not permitted!");
            return 0;
        }
        System.out.println("Enter your ID without commas or periods: ");
        String dni = leer.next();
        System.out.println("DNI entered is: " + dni);
        System.out.println("Do you have the pass ('Vip' or 'Discount' or 'none')?");
        String ticket = leer.next();
        if (ticket.equalsIgnoreCase("vip")){
            System.out.println("You can come in. Enjoy your game");
            return vip;
        }
        if (ticket.equalsIgnoreCase("Discount")){
            System.out.println("Do you want to buy the 'Vip' or 'normal' ticket (with 50% discount)? or 'n' otherwise");
            ticket = leer.next();
            if (ticket.equalsIgnoreCase("vip")) {
                System.out.println("Purchase made successfully. Enjoy your game");
                return (short) (vip / 2);
            }
            if (ticket.equalsIgnoreCase("normal")){
                System.out.println("Purchase made successfully. Enjoy your game");
                return (short) (normal/2);
            }
            if (ticket.equalsIgnoreCase("n")){
                System.out.println("Goodbye, come back soon");
                return 0;
            }
        }
        if (ticket.equalsIgnoreCase("none")){
            System.out.println("Do you want to buy the 'Vip' or 'normal' ticket? or 'n' otherwise");
            ticket = leer.next();
            if (ticket.equalsIgnoreCase("vip")) {
                System.out.println("Purchase made successfully. Enjoy your game");
                return vip;
            }
            if (ticket.equalsIgnoreCase("normal")){
                System.out.println("Purchase made successfully. Enjoy your game");
                return normal;
            }
            if (ticket.equalsIgnoreCase("n")){
                System.out.println("Goodbye, come back soon");
                return 0;
            }
        }
        return 0;
    }
}

