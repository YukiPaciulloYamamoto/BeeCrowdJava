package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1001 {

/*
    Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X.
    Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que foi especificado.
    Não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

    Entrada
        A entrada contém 2 valores inteiros.

    Saída
        Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Coloque um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.
 */

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

    }
}
