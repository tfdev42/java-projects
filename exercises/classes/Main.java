package classes;

public class Main {
    
    public static void main(String[] args) {
        
        Car porsche = new Car();        
        Car mercedes = new Car();

        porsche.setModel("Carrera");
        System.out.printf("Model is %s%n", porsche.getModel());

        porsche.setModel("911");
        System.out.printf("Model is %s%n", porsche.getModel());

    }
}
