package Nedelja2.IndividualneVezbe;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite trocifren broj: ");
        int broj = sc.nextInt();

        if (broj < 100 || broj > 999)
        {
            System.out.println("Greska!");
        }
        else
        {
            int prvaCifra = broj % 10;
            broj = broj / 10;
            int drugaCifra = broj % 10;
            broj = broj / 10;
            int trecaCifra = broj % 10;

            int sum = prvaCifra + drugaCifra + trecaCifra;

            System.out.println("Suma je: " + sum);
        }
    }
}
