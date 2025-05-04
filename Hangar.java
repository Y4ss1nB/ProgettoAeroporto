public class Hangar {

    //dichiarazione semaforo
    private Semaforo semaforoHangar;

    //costruttore
    public Hangar(){
        this.semaforoHangar = new Semaforo(5);
    }

    public void entraInHangar(Aereo aereo) {
        this.semaforoHangar.p();
        System.out.println("\nsta entrando nel hangar l'aereo: "+ aereo.getiD());
    }

    public void esciDaHangar(Aereo aereo) {
        System.out.println("\nsta uscendo dall hangar l'aereo: "+ aereo.getiD());
        this.semaforoHangar.v();
    }
}