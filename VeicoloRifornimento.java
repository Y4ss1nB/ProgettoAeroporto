public class VeicoloRifornimento {

    //dichiarazione semaforo
    private Semaforo semaforoVeicoloRifornimento;

    //costruttore
    public VeicoloRifornimento(){
        this.semaforoVeicoloRifornimento = new Semaforo(1);
    }

    public void rifornisci(Aereo aereo) {
        this.semaforoVeicoloRifornimento.p();

        aereo.setLivelloBenzina(aereo.getMaxLitriSerbatoioBenzina()); //l'aereo viene rifornito
        System.out.println("\nRifornito al massimo il veicolo: " + aereo.getiD());

        this.semaforoVeicoloRifornimento.v();
    }
}