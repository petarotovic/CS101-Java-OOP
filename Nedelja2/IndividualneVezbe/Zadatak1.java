package Nedelja2.IndividualneVezbe;

import java.util.Scanner;

public class Zadatak1  {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite duzinu poluprecnika osnove cilindra: ");
        double poluprecnik = input.nextDouble();
        double povrsina = poluprecnik * poluprecnik * Math.PI;
        System.out.println("Povrsina je: " + povrsina);
    }
}
