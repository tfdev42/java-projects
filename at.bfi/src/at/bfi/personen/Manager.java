package at.bfi.personen;

public class Manager {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        System.out.println("Name ist: " + p1.getName());
        p1.setName("Tom");
        System.out.println("Name ist: " + p1.getName());

        Person p2 = new Person();
        p2.setName("Ida");
        System.out.println("Name ist: " + p2.getName());

        Person p3 = new Person("Person3");
        System.out.println("Name ist: " + p3.getName());
        
    }
}
