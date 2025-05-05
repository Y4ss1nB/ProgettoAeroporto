public class VeicoloPersone {

    //Attributo
    private Semaforo semaforoVeicoloPersone;

    //costruttore
    public VeicoloPersone(){
        this.semaforoVeicoloPersone = new Semaforo(1);
    }


    public void caricaPasseggeri(Aereo aereo) {
        semaforoVeicoloPersone.p();

       if (aereo.getNumPersoneDaCaricare() > aereo.getNumPersoneMassime()) {
            System.out.println("\n non ci sono posti per tutti alcune persone non saliranno; sono salite "+aereo.getNumPersoneMassime()+" sul veicolo "+aereo.getiD());
            aereo.setNumPersoneEffetiveSuAereo(aereo.getNumPersoneMassime());
       }else{
            System.out.println("\nsono salitti tutti i passegeri, ovvero, "+aereo.getNumPersoneDaCaricare()+" sul veicolo "+aereo.getiD());
       }

        semaforoVeicoloPersone.v();
    }

    public void scaricaPasseggeri(Aereo aereo) {
        semaforoVeicoloPersone.p();
        
        System.out.println("\nsono scesi tutti i passegeri dal veicolo: "+aereo.getiD());

        semaforoVeicoloPersone.v();
    }
}
