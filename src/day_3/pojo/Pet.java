package day_3.pojo;

public class Pet {

    private String name;
    private PetType type;
    private int age;
    private Person owner;

    public Pet(String name, PetType type, int age, Person owner) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.owner = owner;
    }

    public String getName(Person person) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getType(Person person) {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public int getAge(Person person) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return  name + " es un "
                + type.toString().toLowerCase() +
                " y tiene " + age +
                " años.";
    }
}
