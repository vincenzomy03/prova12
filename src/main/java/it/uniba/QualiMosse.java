package it.uniba;
/**
 * Questa classe fornisce suggerimenti sulle mosse disponibili durante il gioco.
 * <<Boundary>>
 */

public class QualiMosse {
    /**
     * Rappresenta il tavoliere utilizzato per il gioco.
     */
    public Tavoliere tavoliere;
    /**
     * Crea un nuovo oggetto della classe Main e lo assegna alla variabile Menu.
     */
    private final Help menu = new Help();

    /**
     * Costruttore della classe QualiMosse.
     *
     * @param t Il tavoliere passato al costruttore.
     */
    public QualiMosse(final Tavoliere t) {

        this.tavoliere = t;
    }

    /**
     * esegue i suggerimenti delle mosse nel gioco.
     */
    public void esegui() {

        if (!tavoliere.isGameInProgress()) {
            System.out.println("Nessuna partita in corso. Per iniziarne una, usa il comando '/Gioca'.");

        } else {
            System.out.println();
            System.out.println("+--------------------------------------------------------------------------------+");
            System.out.println("| Suggerimenti mosse:                                                            |");
            System.out.println("| a) in giallo le caselle raggiungibili con mosse che generano una nuova pedina; |");
            System.out.println("| b) in arancione le caselle raggiungibili con mosse che consentono un salto;    |");
            System.out.println("| c) in rosa le caselle raggiungibili con mosse di tipo a) o b).                 |");
            System.out.println("+--------------------------------------------------------------------------------+\n");

            primoSuggerimento();
            secondoSuggerimento();
            terzoSuggerimento();
        }
    }


    private void primoSuggerimento() {
        int centroRiga = tavoliere.campo.length / 2;
        int centroColonna = tavoliere.campo[0].length / 2;

        tavoliere.campo[centroRiga][centroColonna] = "\u26C3";  // Pedina centrale

        // Imposta le pedine raggiungibili con mosse che generano una nuova pedina
        tavoliere.campo[centroRiga - 1][centroColonna - 1] = "\uD83D\uDFE8";
        tavoliere.campo[centroRiga - 1][centroColonna] = "\uD83D\uDFE8";
        tavoliere.campo[centroRiga - 1][centroColonna + 1] = "\uD83D\uDFE8";
        tavoliere.campo[centroRiga][centroColonna - 1] = "\uD83D\uDFE8";
        tavoliere.campo[centroRiga][centroColonna + 1] = "\uD83D\uDFE8";
        tavoliere.campo[centroRiga + 1][centroColonna - 1] = "\uD83D\uDFE8";
        tavoliere.campo[centroRiga + 1][centroColonna] = "\uD83D\uDFE8";
        tavoliere.campo[centroRiga + 1][centroColonna + 1] = "\uD83D\uDFE8";

        // Imposta le pedine raggiungibili con mosse che consentono un salto
        tavoliere.campo[centroRiga - 2][centroColonna - 2] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga - 2][centroColonna - 1] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga - 2][centroColonna] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga - 2][centroColonna + 1] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga - 2][centroColonna + 2] = "\uD83D\uDFE7";

        tavoliere.campo[centroRiga - 1][centroColonna - 2] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga][centroColonna - 2] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga + 1][centroColonna - 2] = "\uD83D\uDFE7";

        tavoliere.campo[centroRiga - 1][centroColonna + 2] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga][centroColonna + 2] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga + 1][centroColonna + 2] = "\uD83D\uDFE7";

        tavoliere.campo[centroRiga + 2][centroColonna - 2] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga + 2][centroColonna - 1] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga + 2][centroColonna] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga + 2][centroColonna + 1] = "\uD83D\uDFE7";
        tavoliere.campo[centroRiga + 2][centroColonna + 2] = "\uD83D\uDFE7";

        tavoliere.campo[0][0] = "⛶";
        tavoliere.campo[0][tavoliere.COLONNE - 1] = "⛶";
        tavoliere.campo[tavoliere.RIGHE - 1][0] = "⛶";
        tavoliere.campo[tavoliere.RIGHE - 1][tavoliere.COLONNE - 1] = "⛶";

        tavoliere.campodagioco(); // Visualizza il tavoliere
        System.out.println();
    }

    private void secondoSuggerimento() {
        tavoliere.inizializzaCampo();
        tavoliere.setAngoli();

        // Imposta i suggerimenti per il secondo scenario nel tavoliere
        // Esempio di impostazione di suggerimenti per il secondo scenario:
        tavoliere.campo[0][1] = "\uD83D\uDFE8";
        tavoliere.campo[1][1] = "\uD83D\uDFE8";
        tavoliere.campo[1][0] = "\uD83D\uDFE8";
        tavoliere.campo[0][2] = "\uD83D\uDFE7";
        tavoliere.campo[1][2] = "\uD83D\uDFE7";
        tavoliere.campo[2][2] = "\uD83D\uDFE7";
        tavoliere.campo[2][1] = "\uD83D\uDFE7";
        tavoliere.campo[2][0] = "\uD83D\uDFE7";

        tavoliere.campo[Tavoliere.RIGHE - 2][Tavoliere.COLONNE - 1] = "\uD83D\uDFE8";
        tavoliere.campo[Tavoliere.RIGHE - 2][Tavoliere.COLONNE - 2] = "\uD83D\uDFE8";
        tavoliere.campo[Tavoliere.RIGHE - 1][Tavoliere.COLONNE - 2] = "\uD83D\uDFE8";
        tavoliere.campo[Tavoliere.RIGHE - 3][Tavoliere.COLONNE - 1] = "\uD83D\uDFE7";
        tavoliere.campo[Tavoliere.RIGHE - 3][Tavoliere.COLONNE - 2] = "\uD83D\uDFE7";
        tavoliere.campo[Tavoliere.RIGHE - 3][Tavoliere.RIGHE - 3] = "\uD83D\uDFE7";
        tavoliere.campo[Tavoliere.RIGHE - 2][Tavoliere.COLONNE - 3] = "\uD83D\uDFE7";
        tavoliere.campo[Tavoliere.RIGHE - 1][Tavoliere.COLONNE - 3] = "\uD83D\uDFE7";

        tavoliere.campodagioco();
        System.out.println();
    }

    private void terzoSuggerimento() {
        tavoliere.inizializzaCampo();

        // Imposta i suggerimenti per il terzo scenario nel tavoliere
        // Esempio di impostazione di suggerimenti per il terzo scenario:
        tavoliere.campo[0][0] = "\u26C3";
        tavoliere.campo[1][0] = "\u26C3";
        tavoliere.campo[4][0] = "\u26C1";
        tavoliere.campo[0][Tavoliere.COLONNE - 1] = "\u26C1";
        tavoliere.campo[Tavoliere.RIGHE - 1][Tavoliere.COLONNE - 1] = "\u26C3";

        tavoliere.campo[0][1] = "\uD83D\uDFE8";
        tavoliere.campo[1][1] = "\uD83D\uDFE8";
        tavoliere.campo[0][2] = "\uD83D\uDFE7";
        tavoliere.campo[1][2] = "\uD83D\uDFE7";
        tavoliere.campo[2][2] = "\uD83D\uDFE7";
        tavoliere.campo[3][2] = "\uD83D\uDFE7";
        tavoliere.campo[3][1] = "\uD83D\uDFE7";
        tavoliere.campo[3][0] = "\uD83D\uDFE7";
        tavoliere.campo[2][1] = "\uD83D\uDFEA";
        tavoliere.campo[2][0] = "\uD83D\uDFEA";

        tavoliere.campo[Tavoliere.RIGHE - 2][Tavoliere.COLONNE - 1] = "\uD83D\uDFE8";
        tavoliere.campo[Tavoliere.RIGHE - 2][Tavoliere.COLONNE - 2] = "\uD83D\uDFE8";
        tavoliere.campo[Tavoliere.RIGHE - 1][Tavoliere.COLONNE - 2] = "\uD83D\uDFE8";
        tavoliere.campo[Tavoliere.RIGHE - 3][Tavoliere.COLONNE - 1] = "\uD83D\uDFE7";
        tavoliere.campo[Tavoliere.RIGHE - 3][Tavoliere.COLONNE - 2] = "\uD83D\uDFE7";
        tavoliere.campo[Tavoliere.RIGHE - 3][Tavoliere.RIGHE - 3] = "\uD83D\uDFE7";
        tavoliere.campo[Tavoliere.RIGHE - 2][Tavoliere.COLONNE - 3] = "\uD83D\uDFE7";
        tavoliere.campo[Tavoliere.RIGHE - 1][Tavoliere.COLONNE - 3] = "\uD83D\uDFE7";

        tavoliere.campodagioco();
        System.out.println();
        tavoliere.inizializzaCampo();
        tavoliere.setAngoli();
    }

}
