package be.intecbrussel;

import java.util.Scanner;

public class GemiddeldeVanGetallen {
 static void Gemiddelde() {
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter a = ");
        int a = kbd.nextInt();

        System.out.println("enter b = ");
        int b = kbd.nextInt();

        System.out.println("enter c = ");
        int c = kbd.nextInt();

        int gemiddelde = (a + b + c) / 3;

        System.out.println("Het gemiddelde is = " + gemiddelde);


    }

    public static void main(String[] args) {

        Gemiddelde();
    }}



