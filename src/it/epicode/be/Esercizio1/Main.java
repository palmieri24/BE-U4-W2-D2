package it.epicode.be.Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 1");

            Scanner input = new Scanner(System.in);
            System.out.print("Inserisci il numero di parole da inserire (N): ");
            int N = input.nextInt();

            input.nextLine(); // Consuma il newline

            Set<String> paroleDistinte = new HashSet<>();
            Set<String> paroleDuplicate = new HashSet<>();

            System.out.println("Inserisci le " + N + " parole:");
            for (int i = 0; i < N; i++) {
                String parola = input.nextLine().trim();

                if (!paroleDistinte.add(parola)) {
                    paroleDuplicate.add(parola);
                }
            }

            input.close();

            System.out.println("Parole Duplicate:");
            for (String parola : paroleDuplicate) {
                System.out.println(parola);
            }

            System.out.println("Numero di Parole Distinte: " + paroleDistinte.size());

            System.out.println("Elenco delle Parole Distinte:");
            for (String parola : paroleDistinte) {
                System.out.println(parola);
            }
        }

    }
}