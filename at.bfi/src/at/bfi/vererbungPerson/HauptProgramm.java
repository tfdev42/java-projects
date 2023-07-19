package at.bfi.vererbungPerson;

public class HauptProgramm {
    public static void main(String[] args) {
        Person p1 = new Person("Thomas", "Edison");

        System.out.println(p1);
        System.out.println();

        // Kunde ausprobieren

        Kunde susi = new Kunde("Susi", "Weber", 564231);
        System.out.println(susi);

        Person susi2 = susi;
        System.out.println(susi2);
        System.out.println();

        Mitarbeiter daniel = new Mitarbeiter("Daniel", "Weber", "Vinothek");
        System.out.println(daniel);
        System.out.println();

        VIPkunde vip = new VIPkunde("Elvis", "Presley", 45, "Boni3");

        // Verwalten von Obj der Super- und Subklassen in einem gemeinsamen Array
        Person[] alle = new Person[4];
        alle[0] = daniel;
        alle[1] = susi;
        alle[2] = p1;
        alle[3] = vip;

        // Alle Persons im Array ausgeben
        // for (Person person : alle) {
        //     System.out.println(person);            
        // }
        for (int i=0; i<alle.length; i++){
            System.out.print(alle[i].getvName());

            if (alle[i] instanceof Mitarbeiter){
                System.out.print(" ist ein MA der Abteilung ");
                Mitarbeiter m = (Mitarbeiter)alle[i];
                System.out.println(m.getAbteilung());
            }else if (alle[i] instanceof VIPkunde){
                System.out.print(" ist ein VIP-Kunde mit der Bonusklasse ");
                VIPkunde v = (VIPkunde)alle[i];
                System.out.println(v.getBonusKlasse());
            }
            else if (alle[i] instanceof Kunde){
                System.out.print(" ist ein Kunde mit der Kundennummer ");
                Kunde k = (Kunde)alle[i];
                System.out.println(k.getKundeID());
            }else System.out.println(" ist eine Person");

            System.out.println(alle[i].wasTustDu());
        }


    }
}
