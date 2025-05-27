package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1019 {

/*
    Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

    Entrada
        O arquivo de entrada contém um valor inteiro N.

    Saída
        Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);

        int segundos = scan.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos - (horas * 3600)) / 60;
        segundos = segundos % 60;

        System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));
    }
}

/*
    Exemplo: Segundos = 938493


    Horas -> 938493 / 3600 = 260
    Minutos -> (938493 - (260 * 3600)) / 60 -> (938493 - 936000) / 60 -> 2493 / 60 = 41
    Segunodos -> 938493 % 938493 = 33 (Resto da divisão)

 */