package Nedelja2.Domaci;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite cenu cokolade -> ");
        float cenaCokolade = input.nextFloat();

        System.out.println("Unesite broj dana -> ");
        int brojDana = input.nextInt();

        System.out.println("Cena cokolade posle 3 dana je -> " + (cenaCokolade + ((cenaCokolade * 0.03) * 3)));
    }
}
