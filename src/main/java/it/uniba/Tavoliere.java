package it.uniba;

/**
 * Questa classe rappresenta il tavoliere di gioco e
 * gestisce la sua configurazione e visualizzazione.
 * <<Entity>>
 */

public class Tavoliere {

    /**
     * Campo di gioco rappresentato come una matrice di stringhe.
     */
    public String[][] campo;

    /**
     * Indica se il gioco è in corso.
     */
    private boolean gameInProgress;

    /**
     * Numero di righe nel campo di gioco.
     */
    public static final int RIGHE = 7;

    /**
     * Numero di colonne nel campo di gioco.
     */
    public static final int COLONNE = 7;

    /**
     * Costruttore della classe Tavoliere.
     * Questo costruttore inizializza un nuovo tavoliere di gioco.
     * Il tavoliere viene inizializzato con una matrice vuota delle
     * dimensioni RIGHE x COLONNE
     * e il gioco viene impostato come non in corso.
     */
    public Tavoliere() {
        campo = new String[RIGHE][COLONNE];
        gameInProgress = false;
        inizializzaCampo();

    }
    /**
     * Indica se il gioco è in corso.
     * @return true se il gioco è in corso, altrimenti false.
     */
    public boolean isGameInProgress() {
        return gameInProgress;
    }
    /**
     * Imposta lo stato del gioco.
     * @param newGameInProgress true se il gioco è in corso, false altrimenti.
     */
    public void setGameInProgress(final boolean newGameInProgress) {
        this.gameInProgress = newGameInProgress;
    }
    /**
     * Inizia un nuovo gioco sul tavoliere.
     * Questo metodo può essere sovrascritto nelle sottoclassi
     * per personalizzare il
     * comportamento di inizio gioco.
     */
    public void iniziaNuovoGioco() {
        inizializzaCampo();
        setAngoli();
        gameInProgress = true;
    }
    /**
     * Inizializza il campo di gioco.
     * Questo metodo può essere sovrascritto per personalizzare
     * l'inizializzazione del campo di gioco.
     */
    public void inizializzaCampo() {
        // Inizializza la matrice campo con '⛶'
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                campo[i][j] = "⛶";
            }
        }
    }
    /**
     * Imposta gli angoli del tavoliere.
     * Questo metodo può essere sovrascritto nelle per personalizzare
     * l'impostazione degli angoli del tavoliere.
     */
    public void setAngoli() {
        // Imposta gli angoli
        campo[0][0] = "\u26C3";
        campo[0][COLONNE - 1] = "\u26C1";
        campo[RIGHE - 1][0] = "\u26C1";
        campo[RIGHE - 1][COLONNE - 1] = "\u26C3";
    }
    /**
     * Restituisce il campo di gioco del tavoliere.
     * Questo metodo può essere sovrascritto per personalizzare
     * il recupero del campo di gioco.
     */
    public void campodagioco() {
        // Stampa la tabella di gioco
        System.out.print("         ");
        for (int i = 0; i < COLONNE; i++) {
            System.out.printf("   %1c", 'A' + i);
        }
        System.out.println();

        for (int r = 0; r < RIGHE; r++) {
            System.out.printf("%9d", r + 1);
            for (int c = 0; c < COLONNE; c++) {
                System.out.printf("%4s", campo[r][c]);
            }
            System.out.println();
        }
    }
    /**
     * Verifica se c'è una partita in corso sul tavoliere.
     * Questo metodo può essere sovrascritto  per personalizzare
     * il controllo della partita in corso.
     */
    public void partitaincorso() {
        if (isGameInProgress()) {
            System.out.println("C'è una partita in corso.\n");
            campodagioco();
        } else {
            System.out.println("Nessuna partita in corso.");
            System.out.println("Per iniziarne una, usa il comando '/Gioca'.");
        }
    }
}
