import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */
        System.out.println("Ćwiczenie 3");

        /* zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
           a) stworzyć objekt punktA typu Punkt,
           w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
           b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
           --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
           c) nadpisać wartości pól z objektu punktA za pomocą setterów i
           ponownie wywołać metodę toString();
           d) wypisać wartości pól (za pomocą getterów),
           e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        System.out.println("Zadanie 1");

        Punkt punktA = new Punkt(7);
        punktA.toString();
        System.out.println("punktA: " + punktA);

        Punkt punkt = new Punkt(1,2,3);
        punktA.toString();
        System.out.println("punktA: " + punktA);


        punktA.setpX(100);
        punktA.setpY(200);
        punktA.setpZ(300);
        punktA.toString();
        System.out.println("punktA: " + punktA);

        System.out.println("Zmienna pX: " + punktA.getpX() +
                "\nZmienna pY: " + punktA.getpY() +
                "\nZmienna pZ: " + punktA.getpZ());

        System.out.println("Suma wartości dla punktu punktA = {" + punktA.getpX() + ", " + punktA.getpY() + ", " + punktA.getpZ() + "} to: " + punktA.suma());
        System.out.println("Roznica pierwsza wartości dla punktu punktA = {" + punktA.getpX() + ", " + punktA.getpY() + ", " + punktA.getpZ() + "} to: " + punktA.roznica());
        System.out.println("Roznica druga wartości dla punktu punktA = {" + punktA.getpX() + ", " + punktA.getpY() + ", " + punktA.getpZ() + "} to: " +
                punktA.roznica(punktA.getpX(), punktA.getpY(), punktA.getpZ()));
    }
}