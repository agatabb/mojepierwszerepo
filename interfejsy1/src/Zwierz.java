/**
 * Created by Agata on 09.11.2017.
 */

interface Plywa{
    float podajGlebokosc ();
}
interface WydajeGlos{
    String podajGlos ();
}
public abstract class Zwierz {
    String nazwa;

    public Zwierz(String nazwa) {
        this.nazwa = nazwa;
    }
    public String podajNazwe () { return nazwa ;}
    public abstract String podajGatunek ();
    public abstract void info ();
}
