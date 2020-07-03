package Algoritmos_Vetores;

public class Inversão {
    public static void main(String[] args) {
        int a[] = {7, 3, 5, 1, 8, 2, 4, 9, 12, 87},
            aux,
            n = a.length;

        double meio = Math.floor(n/2);

        for (int i = 0; i < meio; i++) {
            aux = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = aux;
        }

        for (int i = 0; i < a.length; i++)  {
            System.out.println("Vetor invertido: " + a[i]);
        }
    }
}
