package it.uniba;
/**
 * Classe Help dell'applicazione.
 * <<Control>>
*/
public class Help {

        /**
         * Metodo statico per mostrare il menu dell'applicazione.
         * Il menu elenca i comandi disponibili per l'utente.
         */
    public static void mostramenu() {

            // Mostra il menu
            System.out.println();
            System.out.println("+-------------------------------------------------------------------------------+");
            System.out.println("|                                   COMANDI                                     |");
            System.out.println("|      - /Gioca : per avviare una nuova partita                                 |");
            System.out.println("|      - /Vuoto : per mostrare il tavoliere vuoto                               |");
            System.out.println("|      - /Tavoliere : per mostrare il tavoliere e tutte le pedine posizionate   |");
            System.out.println("|      - /QualiMosse : per mostrare le mosse da fare                            |");
            System.out.println("|      - /Abbandona : per abbandonare la partita in corso                       |");
            System.out.println("|      - /Esci : per uscire dal gioco                                           |");
            System.out.println("+-------------------------------------------------------------------------------+");

    }
}
