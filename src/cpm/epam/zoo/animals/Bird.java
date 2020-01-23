package cpm.epam.zoo.animals;

public class Bird extends Animal{

    public Bird(int age, String gender, double weight) {
        super(age, gender, weight);
    }

    public void move() {
        System.out.println("Flapping wings... ");
    }

}
