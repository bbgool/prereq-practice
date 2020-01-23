package cpm.epam.zoo.animals;

public class Zoo {
    public static void main(String[] args) {
        Animal sparrow1 = new Sparrow(1,"Male", 1.2);
        /*sparrow1.move();
        sparrow1.eat();*/

        Animal fish1 = new Fish(1, "Female", 0.2);
        //fish1.move();


        Bird parrot = new Bird(3, "female", 1.1);
       /* parrot.eat();
        parrot.sleep();*/

        Chicken chick1 = new Chicken(1, "Male", 1.2);

        moveAnimals(fish1);
        moveAnimals(sparrow1); 
    }

    public static void moveAnimals(Animal animal){
        animal.move();
    }

}
