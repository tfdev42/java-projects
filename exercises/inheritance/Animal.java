package inheritance;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    
    // CONSTRUCTOR CHAINING
    public Animal() {
        this("", 0, 1, 0, 0);
        System.out.println("Animal() was called");
    }    

    public Animal(String name, int size, int weight) {
        this(name, 1, 1, size, weight);
        System.out.println("Animal(name, size, weight) was called");
    }


    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        System.out.println("Animal() full constructor called");
    }


    // GETTERS
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }


    // METHODS
    public void eat(){
        System.out.println("Animal.eat() called");

    }

    public void move(int speed) {
        System.out.printf("Animal.move() called. Animal is moving at %d speed%n", speed);
    }

    public void showInfo(){
        System.out.println();
        System.out.println("Name is " + getName());
        System.out.println("Brain is " + getBrain());
        System.out.println("Body is " + getBody());
        System.out.println("Size is " + getSize());
        System.out.println("Weight is " + getWeight());
    }
    

    
    

    
}
