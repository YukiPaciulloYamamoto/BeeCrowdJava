package AResolver;

import java.util.Scanner;

public class BeeCrowd_1021 {

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        double n = scan.nextInt();

        System.out.println(n);

        //Notas
        System.out.println(n/100 + " nota(s) de R$ 100,00");
        n = n % 100;
        System.out.println(n/50 + " nota(s) de R$ 50,00");
        n = n % 50;
        System.out.println(n/20 + " nota(s) de R$ 20,00");
        n = n % 20;
        System.out.println(n/10 + " nota(s) de R$ 10,00");
        n = n % 10;
        System.out.println(n/5 + " nota(s) de R$ 5,00");
        n = n % 5;
        System.out.println(n/2 + " nota(s) de R$ 2,00");
        n = n % 2;

        //Moedas
        System.out.println(n + " moeda(s) de R$ 1,00");
        System.out.println(n/0.5 + " moeda(s) de R$ 0,50");
        System.out.println(n/0.25 + " moeda(s) de R$ 0,25");
        System.out.println(n/0.10 + " moeda(s) de R$ 0,10");
        System.out.println(n/0.5 + " moeda(s) de R$ 0,05");
        System.out.println(n + " moeda(s) de R$ 0,01");
    }
}
