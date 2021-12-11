import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        System.out.println("Ćwiczenie 2");
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        System.out.println("Zadanie 1");

        Student student1 = new Student("Paulina", "Kowalska", 25, true);
        Student student2 = new Student("Mateusz", "Nowak", 24, false);
        Student student3 = new Student("Klaudia","Nowicka",27, true);

        Student[] studenci = {student1, student2, student3};

        for (Student student : studenci) {
            String czyAktywnyStudent;
            if (student.czyAktywny == true) {
                czyAktywnyStudent = "Student aktywny";
            }
            else {
                czyAktywnyStudent = "Student nieaktywny";
            }
            System.out.println(student.imie + " " + student.nazwisko + ", wiek: " + student.wiek + ", " + czyAktywnyStudent);
        }
    }
}
