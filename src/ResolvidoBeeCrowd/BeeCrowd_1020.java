package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1020 {

/*
    Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

    Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
    Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
    Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

    Entrada
        O arquivo de entrada contém um valor inteiro.

    Saída
        Imprima a saída conforme exemplo fornecido.
 */

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int diasRecebidos = scan.nextInt();

        int anos = diasRecebidos / 365;
        int diasFaltantes = diasRecebidos % 365;
        int meses = diasFaltantes / 30;
        int dias = diasFaltantes % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}

/*
    É necessario criar outra váriavel para calcular os dias e os meses!

    Sem a variavel "diasFaltantes" não tem como calcular os dias, porque é necessario o resto da divisão!

    Exemplo:

    diasRecebidos = 400.

    anos = diasRecebidos / 365 -> 1
    diasFaltantes = diasRecebidos % 365 -> 35
    meses = diasFaltantes / 30 -> 1
    dias = diasFaltantes % 30 -> 5

    (1) Ano, (1) Mes e (5) Dias
 */