package Algoritmos_Ordenação;

public class Ordenação_Seleção {
    public static void main(String[] args) {
        int a[] = {95, 18, 22, 11, 32, 76, 2, 24},
            menor,
            posicao;

        for (var i = 0; i < a.length-1; i++) {
            menor = a[i];
            posicao = i;

            for (int j = i+1; j < a.length; j++) {
                if (a[j] < menor) {
                    menor = a[j];
                    posicao = j;
                }
            }

            a[posicao] = a[i];
            a[i] = menor;
        }

        for (int i = 0; i < a.length ; i++)  {
            System.out.println("Vetor ordenado: " + a[i]);
        }

    }
}
