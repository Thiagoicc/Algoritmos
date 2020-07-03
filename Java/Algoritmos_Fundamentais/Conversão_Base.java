/*package Algoritmos_Fundamentais;

import java.util.Scanner;

public class Conversão_Base {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num,
            a[] = new int[2];

        System.out.println("Digite um número inteiro decimal:");
        num = entrada.nextInt();

        int q = num;

        for(int i = 0; num > 0 ;i++)    {
            a[i] = q % 2;
            q = (int) Math.floor(q/2);
        }

        for(int i = a.length-1; i >= 0; i--)   {
            System.out.println(a[i]);
        }
    }
}
*/