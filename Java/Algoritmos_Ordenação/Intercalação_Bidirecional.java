package Algoritmos_Ordenação;

public class Intercalação_Bidirecional {
    public static void main(String[] args) {
        int a[] = {15, 18, 42, 51};
        int b[] = {8, 11, 16, 17, 44, 58, 71, 74};
        int tamanho = a.length + b.length; // tamanho = 12
        int c[] = new int[tamanho];
        int p = 0,
            q = 0;

        for(int i = 0; i < tamanho; i++)    {
            if((p < a.length && a[p] < b[q]) || q == b.length){
                c[i] = a[p];
                p++;
            }
            else    {
                c[i] = b[q];
                q++;
            }
        }

        for (int z = 0; z < c.length;z++) {
            System.out.print(c[z] + " ");
        }
    }
}