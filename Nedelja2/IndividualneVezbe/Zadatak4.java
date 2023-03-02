package Nedelja2.IndividualneVezbe;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite kolicinu vode: ");
        double kolicinaVode = sc.nextDouble();

        System.out.println("Unesite pocetnu temperaturu: ");
        double pocetnaTemp = sc.nextDouble();

        System.out.println("Unesite konacnu temperaturu: ");
        double konacnaTemperatura = sc.nextDouble();

        double k = kolicinaVode * (konacnaTemperatura - pocetnaTemp) * 4184;

        System.out.println("Potrebna energija je: " + k);
    }
}
