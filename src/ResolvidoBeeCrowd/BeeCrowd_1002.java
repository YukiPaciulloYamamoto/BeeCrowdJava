package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1002 {

/*
    A fórmula para calcular a área de uma circunferência é: area = π * raio2. Considerando para este problema que π = 3.14159:

    Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

    ENTRADA

    A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

    Saída
    Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal.
    Utilize variáveis de dupla precisão (double).
    Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

    public static void main (String []args){
        Scanner s = new Scanner(System.in);

        double raio = s.nextDouble();
        double n = 3.14159;
        double area = n * (raio*raio);

       System.out.println(String.format("A=%.4f", area));
    }
}

/*
    Necessário a utilização de "String.format", por conta do BeeCrowd pedir para imprimir um "fim de linha" (Não é possível utilizar somente o println por necessitar formatação)
    O "format" tem as mesmas funções de um printf!! (Estudar melhor)

    Utilizando o printf retornava "Presentation Error" como foi comentado antes.
 */