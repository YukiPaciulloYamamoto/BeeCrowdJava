package ResolvidoBeeCrowd;

import java.util.Scanner;

/*
    Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
    As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

    Entrada
        O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

    Saída
        Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
        Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */
public class BeeCrowd_1018 {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(n);

        System.out.println(n/100 + " nota(s) de R$ 100,00");
        n = n % 100;

        System.out.println(n/50 + " nota(s) de R$ 50,00");
        n = n % 50;

        System.out.println(n/20 + " nota(s) de R$ 20,00");
        n = n % 20;

        System.out.println(n/10 + " nota(s) de R$ 10,00");
        n = n % 10;

        System.out.println(n/5 + " nota(s) de R$ 5,00");
        n = n % 5;

        System.out.println(n/2 + " nota(s) de R$ 2,00");
        n = n % 2;

        System.out.println(n + " nota(s) de R$ 1,00");
    }
}

/*
    Explicação: Vamos pensar que n é igual a 398.

    1. R$ 398,00 precisa de 3 notas de R$ 100,00 porque 398/100 = 3 (divisão inteira).
    2. Beleza, representamos 300, então agora sobra 98.
    3. R$ 98,00 precisa de 1 nota de R$ 50,00 porque 98/50 = 1.
    4. OK, agora temos 48.
    5. R$ 48,00 precisa de 2 nota de R$ 20,00 porque 48/20 = 2.
    6. Temos R$ 8,00 precisa de 0 nota de R$ 10,00 porque 8/10 = 0.
    7. Continuamos com 8.
    8. R$ 8,00 precisa de 1 nota de R$ 5,00 porque 8/5 = 1.
    9. Agora só sobrou 3.
    10. R$ 3,00 precisa de 1 nota de R$ 2,00 porque 3/2 = 1.
    11. Sobrou 1.
    12. Agora o que sobrou é o que dá para representar com 1 nota de R$ 1,00.
 */
