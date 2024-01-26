package day_2;
import day_2.pojo.Person;

public class Main {
    public static void main(String[] args) {

        Person yo = new Person("Ricardo Eliseo","Delgado","41636878",28,1.80,false, new String[]{"Gea", "Hector"});
        yo.introduce();

        Person imaginary = new Person("Joaquin", "Gomez", "34324234", 30, 1.75, true, new String[]{"Blink","Austin","Rodolfo"});
        imaginary.introduce();
    }
}
