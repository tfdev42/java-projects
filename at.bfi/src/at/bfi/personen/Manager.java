package at.bfi.personen;

public class Manager {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        System.out.println("Name ist: " + p1.getName());
        p1.setName("Tom");
        System.out.println("Name ist: " + p1.getName() + " hat " + p1.getAnzTaenze() + " taenze");

        Person p2 = new Person();
        p2.setName("Ida");
        System.out.println("Name ist: " + p2.getName());
        

        Person p3 = new Person("Person3");
        System.out.println("Name ist: " + p3.getName());

        System.out.println(p3);


        // Array von personen (10 personen)

        Person[] gruppe = new Person[10];

        for (int i=0; i<gruppe.length; i++){
            gruppe[i] = new Person("Person" + (i+1));
            System.out.println(gruppe[i]);
        }

        for (int i=0; i<gruppe.length; i++){
            int number = i+1;
            if (number % 2 != 0){
                //gruppe[i].setAnzTaenze(30);
                for (int t=1; t<=30; t++){
                    gruppe[i].tanzen();
                }
                
            }
        }
        
        for (int i=0; i<gruppe.length; i++){
            System.out.println(gruppe[i]);
        }



        
    }
}
