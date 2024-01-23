package day_2;
import day_2.pojo.Person;

public class Main {
    public static void main(String[] args) {

        Person yo = new Person("Ricardo Eliseo","Delgado","41153626",25,1.80,false, new String[]{"Gea", "Hector"});
        yo.introduce();

        Person imaginary = new Person();
        imaginary.setFirstName("Joaquin");
        imaginary.setLastName("Gomez");
        imaginary.setIdentityCard("34324234");
        imaginary.setAge(30);
        imaginary.setHeight(1.75);
        imaginary.setMarried(true);
        imaginary.setPetsNames(new String[]{"Blink","Austin","Rodolfo"});
        imaginary.introduce();
    }
}
