package Algoritmos_Fundamentais;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int alunosQuant,
            alunosNota,
            notaMedia,
            contador = 0;

        System.out.println("Digite a quantidade de alunos: ");
        alunosQuant = entrada.nextInt();

        System.out.println("Digite a nota média: ");
        notaMedia = entrada.nextInt();

        for(int i = 1 ; i <= alunosQuant ; i++) {
            System.out.println("Digite a nota do " + i + "º aluno: ");
            alunosNota = entrada.nextInt();

            if(alunosNota > notaMedia) {
                contador++;
            }
        }

        System.out.println("O número de alunos aprovados foram: " + contador);
    }
}
