package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1036 {

/*
    Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
    Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossível calcular”,
    caso haja uma divisão por 0 ou raiz de número negativo.

     x = -b ± √(b² – 4ac)/ 2.a
*/

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double Delta = ((B*B) - 4*A*C);

        if (A == 0 || Delta < 0){
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-B + Math.sqrt(Delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(Delta)) / (2 * A);
            System.out.println(String.format("R1 = %.5f", R1));
            System.out.println(String.format("R2 = %.5f", R2));
        }
    }
}