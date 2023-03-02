package Nedelja2.IndividualneVezbe;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Medjuzbir -> ");
        double medjuzbir = sc.nextDouble();
        System.out.println("Napojnica u % -> ");
        double napojnica = sc.nextDouble();

        System.out.println("Napojnica -> " + (medjuzbir * (napojnica / 100)) + " Ukupno -> " + (medjuzbir + (napojnica / 10)));
    }
}
