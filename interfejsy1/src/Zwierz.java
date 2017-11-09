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
class Ryba extends Zwierz implements Plywa {
    float glebokosc;

    public Ryba(String nazwa, float glebokosc) {
        super(nazwa);
        this.glebokosc = glebokosc;
    }

    @Override
    public float podajGlebokosc() {
        return glebokosc;
    }

    @Override
    public String podajGatunek() {
        return "Ryba";
    }

    @Override
    public void info() {
        System.out.println(podajNazwe() + " plywa na glebokosci: "+podajGlebokosc());
    }
}