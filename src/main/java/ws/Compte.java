package ws;

import java.time.LocalDate;

public class Compte {
    private int code;
    private double solde;
    private LocalDate dateCreation;

    public Compte(int code, double solde, LocalDate dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Compte() {}

    public int getCode() {
        return code;
    }
}
