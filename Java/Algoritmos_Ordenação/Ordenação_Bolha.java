package Algoritmos_Ordenação;

public class Ordenação_Bolha {
    public static void main(String[] args) {
        int a[] = {95, 18, 22, 11, 32, 76, 2, 24},
            aux;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }

        for (int i = 0; i < a.length ;i++) {
            System.out.println("Ordem Crescente: " + a[i]);
        }
    }
}
