package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1010 {

/*
    Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
    Após, calcule e mostre o valor a ser pago.

    Entrada
        O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

    Saída
        A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
        O valor deverá ser apresentado com 2 casas após o ponto.
 */

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        double codigoP1 = scan.nextInt(), numeroP1 = scan.nextInt(), valorP1 = scan.nextDouble();
        double codigoP2 = scan.nextInt(), numeroP2 = scan.nextInt(), valorP2 = scan.nextDouble();

        double aPagar = (numeroP1 * valorP1) + (numeroP2 * valorP2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", aPagar));
    }
}
/*
    Definindo varias variaveis na mesma linha!
 */