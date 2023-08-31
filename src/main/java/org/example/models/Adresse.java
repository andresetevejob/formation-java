package org.example.models;

public class Adresse {
    private String noRue;
    private String complement;
    private String codePostal;
    private String ville;

    public String getNoRue() {
        return noRue;
    }

    public void setNoRue(String noRue) {
        this.noRue = noRue;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
