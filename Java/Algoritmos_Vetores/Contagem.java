package Algoritmos_Vetores;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a[] = new int[100],
            nota,
            num;

        System.out.println("Digite a quantidade de alunos: ");
        num = entrada.nextInt();

        for (int i = 0; i < 100; i++) {
            a[i] = 0;
        }

        for (int i = 1; i <= num; i++) {
            System.out.println("Informe a nota (0 a 100) do " + i + "º aluno");
            nota = entrada.nextInt();
            a[nota]++;
        }

        for (var i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.println("Nota: " + i + "  Quantidade: " + a[i]);
            }
        }
    }
}
