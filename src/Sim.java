import java.util.LinkedList;

class Chiamata {
    private String numeroChiamato;
    private int durata; // Durata in minuti

    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Numero chiamato: " + numeroChiamato + ", Durata: " + durata + " minuti";
    }
}

public class Sim {
    private String numero;
    private double credito;
    private LinkedList<Chiamata> listaChiamate;

    public Sim(String numero) {
        this.numero = numero;
        this.credito = 0.0;
        this.listaChiamate = new LinkedList<>();
    }

    public String getNumero() {
        return numero;
    }

    public double getCredito() {
        return credito;
    }

    public void ricarica(double importo) {
        if (importo > 0) {
            credito += importo;
            System.out.println("Ricarica effettuata. Credito attuale: " + credito);
        } else {
            System.out.println("Importo non valido.");
        }
    }

    public void effettuaChiamata(String numeroChiamato, int durata) {
        double costoPerMinuto = 0.10;
        double costoTotale = durata * costoPerMinuto;

        if (credito >= costoTotale) {
            credito -= costoTotale;
            Chiamata chiamata = new Chiamata(numeroChiamato, durata);

            if (listaChiamate.size() == 5) {
                listaChiamate.removeFirst();
            }

            listaChiamate.addLast(chiamata);
            System.out.println("Chiamata effettuata verso " + numeroChiamato + ". Durata: " + durata + " minuti. Credito residuo: " + credito);
        } else {
            System.out.println("Credito insufficiente per effettuare la chiamata.");
        }
    }

    public void visualizzaDatiSim() {
        System.out.println("Dati della SIM:");
        System.out.println("Numero: " + numero);
        System.out.println("Credito: " + credito + " euro");
        if (listaChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata recente.");
        } else {
            System.out.println("Ultime chiamate:");
            for (Chiamata chiamata : listaChiamate) {
                System.out.println(chiamata);
            }
        }
    }

    public static void main(String[] args) {
        // Creazione di una nuova SIM con numero specificato
        Sim miaSim = new Sim("1234567890");

        // Visualizzazione dei dati iniziali della SIM
        miaSim.visualizzaDatiSim();

        // Esempio di ricarica e chiamate (facoltativo per il testing)
        miaSim.ricarica(10.0);
        miaSim.effettuaChiamata("0987654321", 5);
        miaSim.visualizzaDatiSim();
    }
}
