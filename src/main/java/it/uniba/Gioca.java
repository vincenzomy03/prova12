package it.uniba;
/**
 * Questa classe gestisce l'avvio di una nuova partita
 * e l'inizializzazione del tavoliere di gioco.
 * <<Control>>
 */

public class Gioca {
    /**
     * Avvia una nuova partita stampando un messaggio di
     * benvenuto e visualizzando il tavoliere iniziale.
     */
    public void avviaPartita() {
        System.out.println("+-------------------------------------------------------------------+");
        System.out.println("|Benvenuto! Hai appena avviato una nuova partita                    |");
        System.out.println("|Questo è il tavoliere iniziale con la predisposizione di default   |");
        System.out.println("|Ricorda! Tu sei la pedina nera                                     |");
        System.out.println("|Buon Divertimento!                                                 |");
        System.out.println("+-------------------------------------------------------------------+");
    }

    /**
     * Esegue il comando "Gioca", inizializzando e gestendo il tavoliere di gioco.
     *
     * @param tavoliere Il tavoliere di gioco da utilizzare.
     */
    public static void eseguiComandoGioca(final Tavoliere tavoliere) {
        tavoliere.inizializzaCampo();
        tavoliere.setAngoli();
        tavoliere.campodagioco();

        if (!tavoliere.isGameInProgress()) {
            tavoliere.iniziaNuovoGioco();
            System.out.println("Nuova partita avviata...");
        } else {
            System.out.println("Una partita è già in corso...");
        }
    }

}
