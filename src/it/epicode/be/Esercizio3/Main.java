package it.epicode.be.Esercizio3;

public class Main {
    public static void main(String[] args) {


        Rubrica rubrica = new Rubrica();

        rubrica.inserisciContatto("Luca", "3883421234");
        rubrica.inserisciContatto("Ugo", "3456789012");
        rubrica.inserisciContatto("Paolo", "3880985674");


        rubrica.stampaRubrica();

        String nomeCercato = "Ugo";
        String telefonoTrovato = rubrica.cercaConNome(nomeCercato);
        System.out.println("Telefono di " + nomeCercato + ": " + telefonoTrovato);

        String telefonoCercato = "3456789012";
        String nomeTrovato = rubrica.cercaConNumero(telefonoCercato);
        System.out.println("Nome con telefono " + telefonoCercato + ": " + nomeTrovato);

        rubrica.cancellaContatto("Paolo");

        rubrica.stampaRubrica();

    }
}
