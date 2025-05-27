package ResolvidoBeeCrowd;

/*
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.

Exemplo de Entrada	Exemplo de Saída
-5
0
-3
-4
12

3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)
 */

import java.util.Scanner;

public class BeeCrowd_1066 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nPostivo = 0;
        int nNegativo = 0;
        int nPar = 0;
        int nImpar = 0;

        for (int i = 0; i < 5; i++){
            double numeros = scan.nextDouble();

            if (numeros % 2 == 0){
                nPar++;
            } else {
                nImpar++;
            }

            if (numeros > 0){
                nPostivo++;
            } else if (numeros < 0) {
                nNegativo++;
            } else {

            }

        }
        System.out.println(nPar + " valor(es) par(es)");
        System.out.println(nImpar + " valor(es) impar(es)");
        System.out.println(nPostivo + " valor(es) positivo(s)");
        System.out.println(nNegativo + " valor(es) negativos(s)");

        scan.close();
    }
}
