import java.util.ArrayList;

public class Aereoporto {
    //attributi
    private GestorePiste gestorePiste;
    private AreaSosta areaSosta;
    private Hangar hangar;
    private VeicoloRifornimento veicoloRifornimento;
    private VeicoloBagagli veicoloBagagli;
    private VeicoloPersone veicoloPersone;
    
    private ArrayList<Aereo> insiemeAerei;

    //costruttore
    public Aereoporto(){
        this.gestorePiste = new GestorePiste();
        this.areaSosta = new AreaSosta();
        this.hangar = new Hangar();
        this.veicoloRifornimento = new VeicoloRifornimento();
        this.veicoloBagagli = new VeicoloBagagli();
        this.veicoloPersone = new VeicoloPersone();
        this.insiemeAerei = new ArrayList<Aereo>();
    }


}
