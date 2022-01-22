import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */
        System.out.println("Ćwiczenie 5\n");
        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        Auto auto = new Auto("Volkswagen","T-Roc","1.5",105000);
        System.out.println(auto.toString());
        System.out.println("Cena auta: " + auto.wyliczCeneAuta() + " zł.\n");

        AutoPremium autoPremium1 = new AutoPremium("Audi", "A7", "4.0", 270000, 5000);
        System.out.println(autoPremium1.toString());
        System.out.println("Cena auta wzbogacona o kolor: " + autoPremium1.wyliczCeneAuta() + " zł.\n");

        AutoPremium autoPremium2 = new AutoPremium("Volvo", "S90", "2.0", 250000, 4500);
        System.out.println(autoPremium2.toString());
        System.out.println("Cena auta wzbogacona o kolor: " + autoPremium2.wyliczCeneAuta() + " zł.\n");

        AutoPremiumPlus autoPremiumPlus1 = new AutoPremiumPlus("BMW", "X5", "2.0", 297000, 6000, 5000);
        System.out.println(autoPremiumPlus1.toString());
        System.out.println("Cena auta wzbogacona o kolor oraz czujniki parkowania: " + autoPremiumPlus1.wyliczCeneAuta() + " zł.\n");

        AutoPremiumPlus autoPremiumPlus2 = new AutoPremiumPlus("Mercedes-Benz", "GLE", "2.0", 360000, 3000, 5500);
        System.out.println(autoPremiumPlus2.toString());
        System.out.println("Cena auta wzbogacona o kolor oraz czujniki parkowania: " + autoPremiumPlus2.wyliczCeneAuta() + " zł.\n");

        List<Auto> autoList = new ArrayList<>();
        autoList.add(auto);
        autoList.add(autoPremium1);
        autoList.add(autoPremium2);
        autoList.add(autoPremiumPlus1);
        autoList.add(autoPremiumPlus2);
        System.out.println("Lista:\n" + autoList);
    }
}
