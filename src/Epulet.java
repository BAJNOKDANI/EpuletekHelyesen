public class Epulet {
    private String nev;
    private int magassag;
    private String varos;

    public Epulet(String nev, int magassag, String varos) {
        this.nev = nev;
        this.magassag = magassag;
        this.varos = varos;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    @Override
    public String toString() {
        return  nev +
                ", magassag=" + magassag +
                ", varos=" + varos;
    }
}
