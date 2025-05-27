package ResolvidoBeeCrowd;

import java.util.Scanner;

public class BeeCrowd_1012 {

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);

        float A = scan.nextFloat(), B = scan.nextFloat(), C = scan.nextFloat();

        float triangulo = (A * C)/2;
        double circulo = Math.PI * (C*C);
        float trapezio= (A + B) * C / 2 ;
        float quadrado = B * B;
        float retangulo = A * B;

        System.out.println(String. format("TRIANGULO: %.3f", triangulo));
        System.out.println(String. format("CIRCULO: %.3f", circulo));
        System.out.println(String. format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String. format("QUADRADO: %.3f", quadrado));
        System.out.println(String. format("RETANGULO: %.3f", retangulo));

    }
}
