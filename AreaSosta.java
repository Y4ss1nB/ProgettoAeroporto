public class AreaSosta {

    //dichiarazione semaforo
    private Semaforo semaforoSosta;

    //costruttore
    public AreaSosta(){
        this.semaforoSosta =new Semaforo(3);
    }

    public void entraInSosta(Aereo aereo) {
        this.semaforoSosta.p();
        System.out.println("\nnell'area di sosta sta entrando il veicolo: "+aereo.getiD());
    }

    public void esciDaSosta(Aereo aereo) {
        System.out.println("\ndall'area di sosta sta uscendo il veicolo: "+aereo.getiD());
        this.semaforoSosta.v();
    }
}