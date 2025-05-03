public class Semaforo {

    //attributo
    private int valore;

    //costruttore
    public Semaforo(int v){ 
        this.valore = v; 
    }

    synchronized public int getValore() {
        return valore;
    }

    synchronized public void p(){
        while (valore == 0) {
            try { 
                wait(); 
            } catch (InterruptedException e) {}
        }
        this.valore--;
    }
}