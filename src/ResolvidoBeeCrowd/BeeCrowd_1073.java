package ResolvidoBeeCrowd;

/*
Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

Entrada
A entrada contém um valor inteiro N (5 < N < 2000).

Saída
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.

Exemplo de Entrada

6

Exemplo de Saída

2^2 = 4
4^2 = 16
6^2 = 36

 */

import java.util.Scanner;

public class BeeCrowd_1073 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        for (int i = 2; i <= numero; i++){
            if (i % 2 == 0){ //Validação
                System.out.println(i + "^2 = " + (i * i));
            }
        }
    }
}
/*
    Acabei não utilizando "Math.pow()" pois retorna um double.
 */
