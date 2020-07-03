/*package Algoritmos_Fundamentais;

import java.util.Scanner;

public class Inversão_Dígitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero,
            digito,
            invertido = 0;

        double q;

        System.out.println("Digite um número inteiro positivo: ");
        numero = entrada.nextInt();

        q= numero;

        for(int i = numero; i > 0 ; i++)   {
            digito = q % 10;
            invertido *= 10 + digito;
             q = Math.floor(q / 10);
        }

        System.out.println(numero);
        System.out.println(invertido);
    }
}
*/