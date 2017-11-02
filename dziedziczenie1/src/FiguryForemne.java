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
