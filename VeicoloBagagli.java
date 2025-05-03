public class VeicoloBagagli {
    
    //attributo
    private Semaforo semaforoVeicoloBagagli;

    //cosstruttore
    public VeicoloBagagli(){
        this.semaforoVeicoloBagagli = new Semaforo(1);
    }










    public void inserisciBagagli(Aereo aereo){
        this.semaforoVeicoloBagagli.p();

        if (aereo.getKgDaCaricare() > aereo.getKgMax()) {
            System.out.println("\nCaricamento bagagli per "+ aereo.getID()+"; caricati per motivi di capienza solo: "+aereo.getKgMax()+" kg");
            aereo.setKgEffetiviSuAereo(aereo.getKgMax());
        }else{
            System.out.println("\nCaricamento bagagli per "+ aereo.getID()+", tutti i bagali caricati corretamente, sono stati caricati: "+aereo.getKgDaCaricare()+" kg");
            aereo.setKgEffetiviSuAereo(aereo.getKgDaCaricare());
        }
        
       
        this.semaforoVeicoloBagagli.v();
    }
}
