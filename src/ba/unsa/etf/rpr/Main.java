package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj){
        int suma = 0;
        while(broj != 0){
            suma += broj%10;
            broj /= 10;
        }
        return suma;
    }

    public static boolean jeLiDjeljivSumomCifara(int broj){
        if(broj % sumaCifara(broj) == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Unesite neki cijeli broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        if (n <= 0) {
            System.out.println("Broj mora biti pozitivan!");
        } else {
            int brojDjeljivih = 0;
            for (int i = 1; i <= n; i++) {
                if (jeLiDjeljivSumomCifara(i)) {
                    brojDjeljivih++;
                }
            }
            if (brojDjeljivih == 0) {
                System.out.println("Između brojeva 1 i " + n + " nema brojeva djeljivih sumom svojih cifara!");

            } else {
                System.out.println("Brojevi između 1 i " + n + " koji su djeljivi sumom svojih cifara su: ");
                int brojacIspisanih = 0;
                for (int i = 1; i <= n; i++) {
                    if (jeLiDjeljivSumomCifara(i)) {
                        brojacIspisanih++;
                        if (brojacIspisanih == brojDjeljivih) {
                            System.out.print(i + ".");
                        } else {
                            System.out.print(i + ", ");
                        }
                    }
                }
            }
        }
    }
}
