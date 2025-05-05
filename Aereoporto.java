import java.util.ArrayList;
import java.util.Random;

public class Aereoporto {
    //attributi
    private GestorePiste gestorePiste;
    private AreaSosta areaSosta;
    private Hangar hangar;
    private VeicoloRifornimento veicoloRifornimento;
    private VeicoloBagagli veicoloBagagli;
    private VeicoloPersone veicoloPersone;
    private ArrayList<Aereo> insiemeAerei;

    Random random = new Random();

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

    public void creaAerei(){
        int numAerei = 5;
        for (int i = 0; i < numAerei; i++) {
            String ID = "aereo" + i;
            int codiceVolo = random.nextInt(2500);
            String impresaCostrutrice = "Ryanair";
            int pesoMax = random.nextInt(1000);
            int passegeriMax = random.nextInt(500);
            int numPersoneDaCaricare = random.nextInt(550);
            int kgDaCaricare = random.nextInt(1100);
            double maxLitriBenzia = random.nextDouble(100, 200);
            boolean isSoloAndata = i % 2 == 0;
            Aereo aereo = new Aereo(ID, isSoloAndata, codiceVolo, impresaCostrutrice, pesoMax, kgDaCaricare, numPersoneDaCaricare, passegeriMax, maxLitriBenzia, gestorePiste, areaSosta, hangar, veicoloRifornimento, veicoloBagagli, veicoloPersone);
            insiemeAerei.add(aereo);
        }
    }

}
