package inheritance.cars;

public class Car extends Vehicle{

    private int horsePower;

    public Car(int tires, int seats, int motor, int horsePower) {
        super(tires, seats, motor);
        this.setHorsePower(horsePower);;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    
    
    
}
