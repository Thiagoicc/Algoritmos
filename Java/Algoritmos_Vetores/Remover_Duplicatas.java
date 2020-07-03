package Algoritmos_Vetores;

import java.util.ArrayList;
import java.util.List;

public class Remover_Duplicatas {
    public static void main(String[] args) {
        int b[] = {2, 2, 2, 8, 15, 23, 23, 23, 23, 26, 29, 30, 32, 32},
               j = 1;

        List<Integer> a = new ArrayList<Integer>();

        for(int i = 0; i < b.length; i++)   {
            a.add(b[i]);
        }

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(a.get(i))) {
                j++;
                a.set(j - 1, a.get(i));
            }
        }

        for(int i = 0 ; a.size() > i ; i++) {
            a.remove(j);
        }

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }
}