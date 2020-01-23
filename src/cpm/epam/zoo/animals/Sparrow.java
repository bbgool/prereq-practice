package cpm.epam.zoo.animals;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender, double weight) {
        super(age, gender, weight);
    }

    public void fly() {
        System.out.println("Sparrow flying high... ");
    }
}
