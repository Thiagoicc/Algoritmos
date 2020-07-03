package Algoritmos_Ordenação;

public class Ordenação_Inserção {
    public static void main(String[] args) {
        int a[] = {95, 18, 22, 11, 32, 76, 2, 24},
            aux,
            j;

        for(int i = 1; i < a.length ; i++)  {
            aux = a[i];
            j = i;

            while (j > 0 && a[j-1] > aux)   {
                a[j] = a[j-1];
                j--;
            }
            a[j] = aux;
        }

        for (int i = 0; i < a.length ; i++)  {
            System.out.println("Vetor ordenado: " + a[i]);
        }
    }
}
