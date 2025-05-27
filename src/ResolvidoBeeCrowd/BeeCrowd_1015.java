package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1015 {

/*
    Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:

        Distancia = √((x2 - x1)² + (y2 - y1)²)

    Entrada
        O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

    Saída
        Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais.
 */

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble(), y1 = scan.nextDouble();
        double x2 = scan.nextDouble(), y2 = scan.nextDouble();

        double somandoX = (x1 - x2) * (x1 - x2);
        double somandoY = (y1 - y2) * (y1 - y2);
        double XmaisY = somandoX + somandoY;
        double raizQuadrada = (Math.sqrt(XmaisY));

        System.out.println(String.format("%.4f", raizQuadrada));

    }
}

/*
    Utilizando Math.sqrt → Utilizado para calcular a raiz quadrada de um número!
 */
