package day_3.pojo;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private String firstName, lastName, identityCard;
    private int age;
    private double height;
    private boolean isMarried;
    private Set<Pet> pets = new HashSet<>();


    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.isMarried = isMarried;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void addPets(Pet pet){
        pet.setOwner(this);
        this.pets.add(pet);

    }
    public void introduce(){
        System.out.println("\nPresentacion de " + this.getFirstName() + ":");
        System.out.println("¡Hola! Mi nombre es " + this.getFirstName() +" "+ this.getLastName() + ".");
        System.out.println("Tengo "+this.getAge()+" años y mido " + this.getHeight() + " metros de altura.");
        if (this.isMarried()){
            System.out.println("Estoy casado/a.");
        }else {
            System.out.println("No estoy casado/a.");
        }
        System.out.println("Mi DNI es " + this.getIdentityCard() +".");
        System.out.println("Mis mascotas son: ");
        if (this.getPets().isEmpty()){
            System.out.println("No tiene mascotas");
        }else {
            this.getPets().forEach(pet -> System.out.println("- " + pet));
        }
    }

}
