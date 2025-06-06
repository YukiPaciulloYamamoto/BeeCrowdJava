package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1009 {

/*
    Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
    Sabendo que este vendedor ganha 15% de comissão sobre a suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

        Entrada
    O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

        Saída
    Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        String nome = scan.next();
        double salarioFixo = scan.nextDouble();
        double comissao = 0.15 * scan.nextDouble();
        double salarioComissao = salarioFixo + comissao;

        System.out.println(String.format("TOTAL = R$ %.2f", salarioComissao));
    }
}
