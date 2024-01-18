package it.epicode.be.Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    private Map<String, String> rubrica;

    public Rubrica() {
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
    }

    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }


    public String cercaConNumero(String numero) {
        System.out.println(rubrica.entrySet());
        for (Map.Entry<String, String> contatto : rubrica.entrySet()) {
            if (contatto.getValue().equals(numero)) {
                return contatto.getKey();
            }
        }
        return "Contatto non esistente";
    }

    public String cercaConNome(String nome) {
        String numero = rubrica.get(nome);
        return numero != null ? numero : "Contatto non esistente";
    }

    public void stampaRubrica() {
        System.out.println("Rubrica Telefonica:");
        for (Map.Entry<String, String> contatto : rubrica.entrySet()) {
            System.out.println("Nome: " + contatto.getKey() + ", Numero: " + contatto.getValue());
        }
    }
}
