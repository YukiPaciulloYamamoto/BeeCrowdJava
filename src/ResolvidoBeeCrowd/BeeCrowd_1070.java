package ResolvidoBeeCrowd;

/*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

Exemplo de Entrada	Exemplo de Saída
8

9
11
13
15
17
19
 */

import java.util.Scanner;

public class BeeCrowd_1070 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        x = x + 1 - (x % 2); //Validando se o número é ímpar

        for (int i = 0; i < 12; i = i+2){
            System.out.println(x+i);
        }
    }
}

 /*
 Explicando codigo:

    x = x + 1 - (x % 2);
    Vamos supor que x é igual a 4 e em outra vamos supor que ele seja 7.
    Então vamos ter:

        x = 4 + 1 - (4 % 2) -> x = 5 - 0 -> x = 5
        x = 7 + 1 - (7 % 2) -> x = 8 - 1 -> x = 7

    Essa validação funciona a partir do resto da divisão entre um número por 2
    (sempre sobrando 0 se for par e 1 se for ímpar).

    Após isso realizamos o for loop:

        for(int i = 0; i < 12; i = i+2){ System.out.println(x+i); }


    O i precisa ser menor que 12, pois estamos pulando de 2 em 2, dando assim 6 voltas!
    Agora o Sout(x+i) soma o numero passado no console (Após passar pela validação acima) e imprime os 6 números impares seguintes!
  */