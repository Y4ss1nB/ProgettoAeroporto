public class Aereo extends Thread{

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

    //variabili comuni per tutti gli aerei
    private GestorePiste gestorePiste;
    private AreaSosta aereaSosta;
    private Hangar hangar;
    private VeicoloRifornimento veicoloRifornimento;
    private VeicoloBagagli veicoloBagagli;
    private VeicoloPersone veicoloPersone;


    //costruttore
    public Aereo(String ID, boolean isSoloAndata, int codiceVolo, String impresaCostruttrice, int kgMax, int kgDaCaricare, int numPersoneDaCaricare, int numPersoneMassime, double maxLitriSerbatoioBenzina, GestorePiste gestorePiste, AreaSosta aereaSosta, Hangar hangar, VeicoloRifornimento veicoloRifornimento, VeicoloBagagli veicoloBagagli, VeicoloPersone veicoloPersone){
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

        this.gestorePiste = gestorePiste;
        this.aereaSosta = aereaSosta;
        this.hangar = hangar;
        this.veicoloRifornimento = veicoloRifornimento;
        this.veicoloBagagli = veicoloBagagli;
        this.veicoloPersone = veicoloPersone;

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
    public void setNumPersoneEffetiveSuAereo(int numPersoneEffetiveSuAereo) {
        this.numPersoneEffetiveSuAereo = numPersoneEffetiveSuAereo;
    }
    public void setLivelloBenzina(double livelloBenzina) {
        this.livelloBenzina = livelloBenzina;
    }
    public void setDeveAtterrare(boolean deveAtterrare) {
        this.deveAtterrare = deveAtterrare;
    }

    @Override
    public void run() {
        hangar.esciDaHangar(this);
        aereaSosta.entraInSosta(this);
        veicoloRifornimento.rifornisci(this);
        veicoloPersone.caricaPasseggeri(this);
        veicoloBagagli.inserisciBagagli(this);
        aereaSosta.esciDaSosta(this);
        gestorePiste.usaPista(this);

        if (!this.getIsSoloAndata()) {
            this.setDeveAtterrare(true);
            gestorePiste.usaPista(this);
            this.setDeveAtterrare(false);
            aereaSosta.entraInSosta(this);
            veicoloBagagli.estraiBagagli(this);
            veicoloPersone.scaricaPasseggeri(this);
            veicoloRifornimento.rifornisci(this);
            veicoloPersone.caricaPasseggeri(this);
            veicoloBagagli.inserisciBagagli(this);
            aereaSosta.esciDaSosta(this);
            gestorePiste.usaPista(this);
        }else{
            this.setDeveAtterrare(true);
            gestorePiste.usaPista(this);
            this.setDeveAtterrare(false);
            aereaSosta.entraInSosta(this);
            veicoloBagagli.estraiBagagli(this);
            veicoloPersone.scaricaPasseggeri(this);
            aereaSosta.esciDaSosta(this);
            hangar.entraInHangar(this);
        }
    }


}
