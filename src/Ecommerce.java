class Articolo{
    private String codice;
    private String descrizione;
    private double prezzo;
    private int pezzi;

public Articolo(String codice, String descrizione, double prezzo, int pezzi){
    this.codice = codice;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.pezzi = pezzi;
}

public String getCodice(){
    return codice;
}

public String getDescrizione(){
    return  descrizione;
}

public double getPrezzo(){
    return prezzo;
}

public int getPezzi(){
    return pezzi;
}
}

class Cliente {
    private String codice;
    private String nomeCognome;
    private String email;
    private int iscrizione;


public Cliente(String codice,String nomeCognome, String email, int iscrizione){
    this.codice = codice;
    this.nomeCognome = nomeCognome;
    this.email = email;
    this.iscrizione = iscrizione;
}

public String getCodice(){
    return codice;
}

public String getNomeCognome(){
    return nomeCognome;
}

public String getEmail(){
    return email;
}

public int getIscrizione(){
    return iscrizione;
}
}

class Carrello{
    private Cliente cliente;
    private Articolo[] articoli;
    private int numeroArticoli;
}




public class Ecommerce {

}
