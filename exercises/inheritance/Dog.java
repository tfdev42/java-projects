package inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(){
        this("DefDog", 1, 1, 1, 1, 1, 1, "DefCoat");
    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    
    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);

    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
        
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Eyes is " + getEyes());
        System.out.println("Legs is " + getLegs());
        System.out.println("Tail is " + getTail());
        System.out.println("Teeth is " + getTeeth());
        System.out.println("Coat is " + getCoat());
        
    }
    
}
