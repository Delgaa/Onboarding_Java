package day_3;

import day_3.pojo.Person;
import day_3.pojo.Pet;

import static day_3.pojo.PetType.*;

public class Main {
    public static void main(String[] args) {

        Person yo = new Person("Ricardo", "Delgado", "41646345", 24, 1.80, false);

        Pet mascota1 = new Pet("Gea", GATO, 4);
        Pet mascota2 = new Pet("Hector", GATO, 3);

        yo.addPets(mascota1);
        yo.addPets(mascota2);
        yo.introduce();

        Person imaginary = new Person("Jorge", "Martinez", "31646345", 35, 1.85, true);
        imaginary.introduce();

        Person otherImaginary = new Person("Pablo", "Aguirre", "46546635", 20, 1.85, false);
        Pet mascotaPblo = new Pet("Baronesa", PEZ, 1);
        Pet mascotaPblo2 = new Pet("Arika", PAJARO, 1);
        Pet mascotaPblo3 = new Pet("Bianca", PERRO, 2);

        otherImaginary.addPets(mascotaPblo);
        otherImaginary.addPets(mascotaPblo2);
        otherImaginary.addPets(mascotaPblo3);

        otherImaginary.introduce();
    }
}
