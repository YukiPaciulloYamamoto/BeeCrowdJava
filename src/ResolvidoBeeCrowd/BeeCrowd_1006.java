package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1006 {

/*
    Leia 3 valores, no caso, variáveis A, B e C, as três notas de um aluno.
    A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
    Considere que cada nota pode ir de 0 até 10,0, sempre com uma casa decimal.

    Entrada
        O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

    Saída
        Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10.0;

        System.out.println(String.format("MEDIA = %.1f", MEDIA));
    }
}

/*
    Necessário a utilização de "String.format", por conta do BeeCrowd pedir para imprimir um "fim de linha" (Não é possível utilizar somente o println por necessitar formatação)
 */
