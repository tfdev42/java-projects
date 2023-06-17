package inheritance.cars;

public class Mercedes extends Car{

    private String type = "Mercedes";

    public Mercedes(int tires, int seats, int motor, int horsePower, String type) {
        super(tires, seats, motor, horsePower);
        this.type = type;
    }

    

    
}
