package it.epicode.be.Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 4;
        System.out.println(numeriCasuali(N));
        System.out.println(listaInvertita(numeriCasuali(N)));
        pariDispari(numeriCasuali(N), false);
    }

    public static List<Integer> numeriCasuali(int N) {
        List<Integer> arrayNumeriCasuali = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            int casuale = random.nextInt(101);
            arrayNumeriCasuali.add(casuale);
        }

        return arrayNumeriCasuali;
    }

    public static List<Integer> listaInvertita(List<Integer> list) {
        List<Integer> arrayInvertito = new ArrayList<>(list);
        Collections.reverse(arrayInvertito);
        list.addAll(arrayInvertito);

        return list;
    }

    public static void pariDispari(List<Integer> list, boolean trueFalse) {
        System.out.println(list);
        System.out.println("Valori in posizioni " + (trueFalse ? "pari" : "dispari") + ":");

        for (int i = trueFalse ? 0 : 1; i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }

    }

}
