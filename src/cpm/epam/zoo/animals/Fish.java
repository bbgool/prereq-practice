package cpm.epam.zoo.animals;

public class Fish extends Animal{

    public Fish(int age, String gender, double weight) {
        super(age, gender, weight);
    }

    public void swim(){
        System.out.println("Swim");
    }

    public void move() {
        System.out.println("Swimming... ");
    }
}
