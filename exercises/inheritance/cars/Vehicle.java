package inheritance.cars;

public class Vehicle {

    private int tires;
    private int seats;
    private int motor;

    public Vehicle() {
    }
    public Vehicle(int tires, int seats, int motor) {
        this.setTires(tires);
        this.setSeats(seats);
        this.setMotor(motor);
    }
    public int getTires() {
        return tires;
    }
    public int getSeats() {
        return seats;
    }
    public int getMotor() {
        return motor;
    }
    public void setTires(int tires) {
        this.tires = tires;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    
}
