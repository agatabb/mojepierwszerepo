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
class TrojkatRownoboczny extends FiguryForemne {

    public TrojkatRownoboczny(double a) {
        super(a);
    }

    @Override
    public double pole() {
        return a*a*Math.sqrt(3)/4;
    }

    @Override
    public double obwod() {
        return 3*a;
    }
    @Override
    public String toString() {
        return "Trójkąt równoboczny {" +
                " a : " + a +
                " pole: "+ pole() +
                " obwod: " +obwod()+
                "}";
    }
}
class Prostopadloscian extends TrojkatRownoboczny{
    double h;

    public Prostopadloscian(double a, double h) {
        super(a);
        this.h = h;
    }

    @Override
    public double pole() {
        return super.pole()*h;
    }

    public double objetosc() {
        return 2*super.pole()+super.obwod()*h;
    }

    @Override
    public double obwod() {
        return 0;
    }
    @Override
    public String toString() {
        return "Prostopadloscian {" +
                " a : " + a +
                " h: " + h +
                " pole: "+ pole() +
                " obwod: " +obwod()+
                " objetosc: "+objetosc()+
                "}";
    }
}