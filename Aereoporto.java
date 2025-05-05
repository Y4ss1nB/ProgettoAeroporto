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
        gestorePiste = new GestorePiste();
        areaSosta = new AreaSosta();
        hangar = new Hangar();
        veicoloRifornimento = new VeicoloRifornimento();
        veicoloBagagli = new VeicoloBagagli();
        veicoloPersone = new VeicoloPersone();
        insiemeAerei = new ArrayList<Aereo>();
    }
}
