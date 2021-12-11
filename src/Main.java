import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */
        System.out.println("Ćwiczenie 1");
        Scanner scan = new Scanner(System.in);
        /* zad.1
       a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
       b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
       c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
       d) niech w pętli są podawane wartości liczbowe z klawiatury,
       e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
       f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
       g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        System.out.println("Zadanie 1 ");

        while (true) {
            System.out.println("Podaj liczbe: ");
            int element = scan.nextInt();

            if (element == 0) {
                System.out.println(StatusEnum.KONIEC);
                break;
            } else {
                System.out.println(StatusEnum.KONTYNUUJEMY);
            }

            switch (element) {
                case 1:
                    System.out.println(LiczbyEnum.JEDEN);
                    break;
                case 2:
                    System.out.println(LiczbyEnum.DWA);
                    break;
                case 3:
                    System.out.println(LiczbyEnum.TRZY);
                    break;
                case 4:
                    System.out.println(LiczbyEnum.CZTERY);
                    break;
                case 5:
                    System.out.println(LiczbyEnum.PIEC);
                    break;
                case 6:
                    System.out.println(LiczbyEnum.SZESC);
                    break;
                default:
                    System.out.println("Liczba spoza zakresu.");
                    break;
            }

        }
    }
}
