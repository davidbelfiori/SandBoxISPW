public class Main {
    public  static void main(String[] args) {

        Esercizi esercizi = new Esercizi();

//        // Esercizio 1: Trova il massimo e il minimo in un vettore
//        int[] vettore = {3, 5, 1, 8, -2, 7};
//        System.out.println("Esercizio 1: Trova il massimo e il minimo in un vettore");
//        esercizi.MaxMinVettore(vettore);

//        // Esercizio 2: Stampa solo le vocali di una stringa fornita dall’utente
//        String input = "Ciao Mondo!";
//        System.out.println("\nEsercizio 2: Stampa solo le vocali di una stringa fornita dall’utente");
//        esercizi.stampavocali(input);

        // Esercizio 3: TuttiPositiviPari
//        System.out.println("\nEsercizio 3: TuttiPositiviPari");
//        int NumeroDiElementi = 5; // Puoi cambiare questo valore per
//        esercizi.TuttiPositiviPari(NumeroDiElementi);

        // Esercizio 4: PositivoNegativo
//        System.out.println("\nEsercizio 4: PositivoNegativo");
//        int NumeroDiElementi2 = 5; // Puoi cambiare questo valore per testare con un numero diverso di elementi
//        esercizi.PositivoNegativo();
//
//        Persona Pippo = new Persona("pippo","rossi",30);
//        Persona pippe = new Persona("pippo","bianchi");
//
//        calcolaEta(Pippo);

        //esercizi.MinMaxVettore();

       esercizi.conta();
    }

    public static void calcolaEta(Persona persona) {
        System.out.println("L'età di " + persona + " è: " + persona.getAge());
    }

}
