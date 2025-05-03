public class GestorePiste {
    
    //dichiarazione semaforo 
    private Semaforo semaforoPiste;

    //costruttore
    public GestorePiste(){
        this.semaforoPiste = new Semaforo(3);
    }

    public void usaPista(Aereo aereo){

        if (aereo.getDeveAtterrae() && this.semaforoPiste.getValore() == 0) {
           
            System.out.println("\nsono occupate tutte le piste l'aereo "+aereo.getID()+" rimarra in volo finchè non sene libera una");
            
        }

        this.semaforoPiste.p();

        System.out.println("\nla pista è in uso dal veicolo: "+aereo.getID());

        //l'aereo usa la pista e poi conlude

        System.out.println("\nla pista non è più in uso dal veicolo: "+aereo.getID());

        this.semaforoPiste.v();
    }
}
