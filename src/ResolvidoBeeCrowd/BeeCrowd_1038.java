package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1038 {

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

    código  especificação   preço
    1       Cachorro Quente R$4.00
    2       X-Salada        R$4.50
    3       X-Bacon         R$5.00
    4       Torrada Simples R$2.00
    5       Refrigerante    R$1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*/

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);

        int item = scan.nextInt();
        int quantidade = scan.nextInt();

        double total;

        switch (item){
            case 1: total = quantidade * 4.00; break;
            case 2: total = quantidade * 4.50; break;
            case 3: total = quantidade * 5.00; break;
            case 4: total = quantidade * 2.00; break;
            case 5: total = quantidade * 1.50; break;

            default: total = 0;
        }

        System.out.println(String.format("Total: R$ %.2f", total));
    }
}
