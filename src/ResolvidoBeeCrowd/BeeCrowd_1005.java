package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1005 {

/*
    Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3,5 e a nota B tem peso 7,5 (A soma dos pesos, portanto é 11). Assuma que cada nota pode ir de 0 até 10,0; sempre com uma casa decimal.

    Entrada
        O arquivo de entrada contém 2 valores com uma casa decimal cada um.

    Saída
        Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade.
        Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
*/

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();

        double MEDIA = ((3.5 * A) + (7.5 * B)) / 11;

        System.out.println(String.format("MEDIA = %.5f", MEDIA));
    }

}

/*
    Necessário a utilização de "String.format", por conta do BeeCrowd pedir para imprimir um "fim de linha" (Não é possível utilizar somente o println por necessitar formatação)
 */