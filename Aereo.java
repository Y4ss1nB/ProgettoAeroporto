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

    public Aereo(String ID, boolean isSoloAndata, int codiceVolo, String impresaCostruttrice, boolean deveAtterrare, int kgMax, int kgDaCaricare, int numPersoneDaCaricare, int numPersoneMassime, double maxLitriSerbatoioBenzina){
        this.ID = ID;
        this.isSoloAndata = isSoloAndata;
        this.codiceVolo = codiceVolo;
        this.impresaCostruttrice = impresaCostruttrice;
        this.deveAtterrare = deveAtterrare;

        this.kgMax = kgMax;
        this.kgDaCaricare = kgDaCaricare;
        this.kgEffetiviSuAereo = 0;

        this.numPersoneDaCaricare = numPersoneDaCaricare;
        this.numPersoneMassime = numPersoneMassime;
        this.numPersoneEffetiveSuAereo = 0;

        this.maxLitriSerbatoioBenzina = maxLitriSerbatoioBenzina;
        this.livelloBenzina = 0;
    }
}
