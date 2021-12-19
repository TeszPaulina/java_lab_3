import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        System.out.println("Ćwiczenie 4");
        List<Student> studenciList = new ArrayList<>();

        Student student = new Student(new Osoba("Ala","Wieszko",45),WydzialEnum.Lekarski);
        studenciList.add(student);
        student = new Student(new Osoba("Tomasz","Kowalski",89),WydzialEnum.Matematyki_i_Informatyki);
        studenciList.add(student);
        student = new Student(new Osoba("Mateusz","Kalicki",56),WydzialEnum.Sztuk_Pięknych);
        studenciList.add(student);
        student = new Student(new Osoba("Maja","Szczesna",12),WydzialEnum.Chemii);
        studenciList.add(student);
        student = new Student(new Osoba("Paulina","Jolicka",67),WydzialEnum.Humanistyczny);
        studenciList.add(student);

        for (Student st : studenciList) {
            System.out.println(st);
        }
    }
}