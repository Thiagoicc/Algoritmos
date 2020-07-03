package Algoritmos_Vetores;

public class Maior_Número {
    public static void main(String[] args) {
        int a[] ={7, 3, 1, 5, 9, 0, 2};

        var maior = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maior) {
                maior = a[i];
            }
        }

        System.out.println("Maior elemento: " + maior);
    }
}
