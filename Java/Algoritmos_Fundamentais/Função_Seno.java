package Algoritmos_Fundamentais;

import java.util.Scanner;

public class Função_Seno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n,
            sinal = 1,
            seno = 0,
            j = 1,
                x;

        double termo;

        System.out.println("Digite o valor de x: ");
        x = entrada.nextInt();

        System.out.println("Digite o número de termos da série: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++)    {
            termo =  (Math.pow(x,j) / fat(j));
            seno += sinal * termo;
            sinal = -1 *sinal;
            j = j + 2;
        }

        System.out.println("sen(x) = " + seno);
    }

    public static int fat(int n)    {
        int fat = 1;

        for (int i = n; i >= 1; i--) {
            fat = fat * i;
        }
        return fat;
    }
}
