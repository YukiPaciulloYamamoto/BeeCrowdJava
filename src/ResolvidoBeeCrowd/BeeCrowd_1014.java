package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1014 {

/*
    Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

    Entrada
        O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km)
        E um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

    Saída
        Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
 */

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        double Y = scan.nextDouble();
        double kmRodados = X/Y;

        System.out.println(String.format("%.3f km/l", kmRodados));
    }
}

/*
    Necessario inverter a ordem dentro dos () do .format para poder colocar o "km/l" depois do valor a ser inserido!

    Se → "km/l %.3f", kmRodados | vai imprimir → km/l kmRodados

    Se → "%.3f km/l", kmRodados | vai imprimir → kmRodados km/l
 */
