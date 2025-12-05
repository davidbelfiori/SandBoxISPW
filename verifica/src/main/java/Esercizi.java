import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Esercizi {

    public  void MaxMinVettore(int[] vettore) {
        if (vettore == null || vettore.length == 0) {
            System.out.println("Il vettore è vuoto.");
            return;
        }

        int max = vettore[0];
        int min = vettore[0];

        for (int i = 1; i < vettore.length; i++) {
            if (vettore[i] > max) {
                max = vettore[i];
            }
            if (vettore[i] < min) {
                min = vettore[i];
            }
        }

        System.out.println("Valore massimo: " + max);
        System.out.println("Valore minimo: " + min);
    }

    //Stampare solo le vocali di una stringa fornita dall’utente.
    public void stampavocali( String input){
        String vocali = "aeiouAEIOU";
        System.out.print("Vocali nella stringa: ");
        for (char c : input.toCharArray()) {
            if (vocali.indexOf(c) != -1) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    //Scrivere un programma TuttiPositiviPari che chiede all’utente di inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine dell’inserimento
    //dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti sono tutti positivi e pari,
    //altrimenti stampa "NO". Risolvere questo esercizio senza usare array.

    public void TuttiPositiviPari(int NumeroDiElementi){
        int[] numeri = new int[NumeroDiElementi];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean tuttiPositiviPari = true;
        for (int i = 0; i < NumeroDiElementi; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeri[i] = numero;
            if (numero < 0 || numero % 2 != 0) {
                tuttiPositiviPari = false;
            }
        }
        if (tuttiPositiviPari) {
            System.out.println("Tutti positivi e pari");
        } else {
            System.out.println("NO");
        }
    }


// Scrivere un programma PositivoNegativo che chiede all’utente di inserire una sequenza
//di interi terminata quando l’utente immette il valore 0 e poi stampa "OK" se la sequenza contiene un
//valore positivo seguito da uno negativo, altrimenti stampa il messaggio "NO". A vostra scelta, la stampa
//del messaggio "OK" pu`o interrompere o meno l’inserimento dei valori. Risolvere questo esercizio senza
//usare array.

    public  void  PositivoNegativo() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean condizione = false;

        while (true) {
            System.out.println("Inserisci un numero intero (0 per terminare): ");
            int numero1 = 0;
            numero1 = scanner.nextInt();
            if (numero1 == 0) {
                if (condizione) {
                    System.out.println("OK");
                    break;
                }else{
                    System.out.println("NO");
                    break;
                }
            }
            System.out.println("Inserisci un numero intero: ");
            int numero2 = 0;
            numero2 = scanner.nextInt();
            condizione = numero1 > 0 && numero2 < 0;

        }
    }

    // Scrivere un programma Contrario che chiede all’utente di inserire una stringa e la
    //stampa al contrario. Per esempio, se si immette la stringa "Viva Java"
    // , il programma stampa "avaJ aviV"

    public void Contrario() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Inserisci una stringa: ");
        String input = scanner.nextLine();
       for (int i = input.length()-1; i >= 0; i--) {
           System.out.println(input.charAt(i));
       }
    }


    // Mino e massimo di un vettore
    public void MinMaxVettore(){

        //DICHIARAZIONE
        Scanner scanner = new java.util.Scanner(System.in);


        //chiedere quanti lunghezzaVettore inserire
        System.out.println("inserisci la lunghezza del vettore 1:");
       int lunghezzaVettore1 = scanner.nextInt();

       int[] vettore1= new int[lunghezzaVettore1];
        List<Integer> list = new ArrayList();



//       //Lunghezza vettore 2
//        System.out.println("inserisci la lunghezza del vettore 1:");
//        int lunghezzaVettore2 = scanner.nextInt();
//       int[] vect2 = new int[lunghezzaVettore2];

       for (int i= 0; i<lunghezzaVettore1; i++){
           System.out.println("inserisci il valore"+(i+1)+":");
           vettore1[i] = scanner.nextInt();
       }
//       for (int i= 0; i<lunghezzaVettore2; i++){
//           System.out.println("inserisci il valore"+i+":");
//           vect2[i] = scanner.nextInt();
//       }

       int minVet1 = vettore1[0];
       int maxVet1 = vettore1[0];
       for (int i= 1; i<lunghezzaVettore1; i++){
           if (minVet1> vettore1[i]){
               minVet1 = vettore1[i];
           }
           if (maxVet1 < vettore1[i]){
               maxVet1 = vettore1[i];
           }
       }

        System.out.println("Minimo:"+minVet1);
       System.out.println("Maximo"+maxVet1);

    }



    public void conta(){


        int[] vettore = new int[10];
        System.out.println("Inserisci 10 numeri a tuo piacimento:");
        Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = scanner.nextInt();
        }

        int Positivi=0;
        int Negativi=0;
        int Nulli=0;

        for (int i = 0; i < vettore.length; i++) {
            if (vettore[i] > 0) {
                Positivi++;
            }
            else if (vettore[i] < 0) {
                Negativi++;
            }else{
                Nulli++;
            }
        }
        System.out.println("positivi:"+Positivi);
        System.out.println("negativi:"+Negativi);
        System.out.println("Nulli:"+Nulli);
    }


}
