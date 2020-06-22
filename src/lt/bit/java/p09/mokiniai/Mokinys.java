package lt.bit.java.p09.mokiniai;

public class Mokinys {
    private String vardas;
    private String pavarde = "";
    private int klase;
    private int[] trimestras;

    public Mokinys() {
    }

    public Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.trimestras = trimestras;
    }

    public String pilnasVardas() {
        return (this.vardas == null ? "" : this.vardas) + " " +
                (this.pavarde == null ? "" : this.pavarde);
    }


    public int[] getTrimestras() {
        return trimestras;
    }

    public void setTrimestras(int[] trimestras) {
        //TODO prideti patirkinima ar trimestro
        // pazumiai yre nuo 1 iki 10
        this.trimestras = trimestras;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    @Override
    public String toString() {
        return klase + " " + vardas + " " + pavarde;
    }
}
