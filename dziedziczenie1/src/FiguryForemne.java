/**
 * Created by Agata on 02.11.2017.
 */
public abstract class FiguryForemne {
    protected double a;
    final double pi=Math.PI;

    public FiguryForemne(double a) {
        this.a = a;
    }

    public abstract double pole();
    public abstract double obwod();

    @Override
    public String toString() {
        return "FiguryForemne{" +
                "a: " + a +
                "}";
    }
}
class Okrag extends FiguryForemne{

    public Okrag(double a) {
        super(a);
    }

    @Override
    public double pole() {
        return pi*a*a;
    }

    @Override
    public double obwod() {
        // a oznacza promien okregu
        return 2*pi*a;
    }

    @Override
    public String toString() {
        return "Okrag{" +
                " r : " + a +
                " pole: "+ pole() +
                " obwod: " +obwod()+
                "}";
    }
}