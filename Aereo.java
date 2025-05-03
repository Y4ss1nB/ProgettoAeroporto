public class Aereo {

    //attributi
    private String ID;
    private boolean isSoloAndata;
    private int codiceVolo;
    private String impresaCostruttrice;
    private boolean deveAtterrare;

    private int kgMax;
    private int kgDaCaricare;
    private int kgEffetiviSuAereo;

    private int numPersoneDaCaricare;
    private int numPersoneMassime;
    private int numPersoneEffetiveSuAereo;

    private double maxLitriSerbatoioBenzina;
    private double livelloBenzina;


    //costruttore
    public Aereo(String ID, boolean isSoloAndata, int codiceVolo, String impresaCostruttrice, int kgMax, int kgDaCaricare, int numPersoneDaCaricare, int numPersoneMassime, double maxLitriSerbatoioBenzina){
        this.ID = ID;
        this.isSoloAndata = isSoloAndata;
        this.codiceVolo = codiceVolo;
        this.impresaCostruttrice = impresaCostruttrice;
        this.deveAtterrare = false;

        this.kgMax = kgMax;
        this.kgDaCaricare = kgDaCaricare;
        this.kgEffetiviSuAereo = 0;

        this.numPersoneDaCaricare = numPersoneDaCaricare;
        this.numPersoneMassime = numPersoneMassime;
        this.numPersoneEffetiveSuAereo = 0;

        this.maxLitriSerbatoioBenzina = maxLitriSerbatoioBenzina;
        this.livelloBenzina = 0;
    }

    //getter
    public String getID() {
        return this.ID;
    }
    public int getCodiceVolo() {
        return this.codiceVolo;
    }
    public boolean getIsSoloAndata(){
        return this.isSoloAndata;
    }
    public String getImpresaCostruttrice() {
        return this.impresaCostruttrice;
    }
    public boolean getDeveAtterrae(){
        return this.deveAtterrare;
    }
    public int getKgMax() {
        return this.kgMax;
    }
    public int getKgDaCaricare() {
        return this.kgDaCaricare;
    }
    public int getKgEffetiviSuAereo() {
        return this.kgEffetiviSuAereo;
    }
    public int getNumPersoneDaCaricare() {
        return this.numPersoneDaCaricare;
    }
    public int getNumPersoneMassime() {
        return this.numPersoneMassime;
    }
    public int getNumPersoneEffetiveSuAereo() {
        return this.numPersoneEffetiveSuAereo;
    }
    public double getMaxLitriSerbatoioBenzina() {
        return this.maxLitriSerbatoioBenzina;
    }
    public double getLivelloBenzina() {
        return this.livelloBenzina;
    }

    //setter
    public void setKgEffetiviSuAereo(int kgEffetiviSuAereo) {
        this.kgEffetiviSuAereo = kgEffetiviSuAereo;
    }
    public void setNumPersoneDaCaricare(int numPersoneDaCaricare) {
        this.numPersoneDaCaricare = numPersoneDaCaricare;
    }
    public void setLivelloBenzina(double livelloBenzina) {
        this.livelloBenzina = livelloBenzina;
    }
    public void setDeveAtterrare(boolean deveAtterrare) {
        this.deveAtterrare = deveAtterrare;
    }


}
