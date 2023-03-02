package Nedelja2.IndividualneVezbe;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vrednost u kilogramima: ");
        double pounds = sc.nextDouble();
        double kilograma = pounds * 0.454;
        System.out.println(pounds + " je " + kilograma + " kilograma.");

    }
}
