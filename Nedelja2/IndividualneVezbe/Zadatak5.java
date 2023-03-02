package Nedelja2.IndividualneVezbe;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite trenutno stanje: ");
        double stanje = input.nextDouble();

        System.out.println("Unesite godisnju kamatu: ");
        double godKamata = input.nextDouble();

        final double kamata = stanje * (godKamata / 1200);
        System.out.println("Kamata za naredni mesec iznosi: " + kamata);
    }
}
