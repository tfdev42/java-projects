package inheritance;

public class Main {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Golden Retreaver", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat(); // method from Super Class Animal
        dog.walk();
        dog.run();
        System.out.println();

        Fish fish = new Fish("Gold Fish", 2, 2, 2, 2, 5);
        fish.eat();
        fish.move(3);
        System.out.println();

        Dog defDog = new Dog();
        defDog.eat();
        defDog.walk();
        defDog.run();
        System.out.println();

        fish.showInfo();
        dog.showInfo();
        defDog.showInfo();
        System.out.println();
        
        Animal animal1Animal = new Animal();
        Animal animal2Animal = new Animal("2nd constructor Animal", 2, 2);
        Animal animal = new Animal("3rd constructor Animal", 3, 3, 3,3);
        
        


    }
}
