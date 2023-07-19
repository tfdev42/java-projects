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


    }
}
