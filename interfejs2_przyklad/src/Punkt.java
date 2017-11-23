
import javafx.beans.NamedArg;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by USER on 2017-11-18.
 */
public class Punkt extends javafx.geometry.Point2D {
    public Punkt(double x, double y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Punkt{x=" + getX() + "y=" + getY() + "}";
    }

    public static double odl(Punkt p1, Punkt p2) {
        double dx, dy;
        dx = p2.getX() - p1.getX();
        dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);

    }
}
class Distance{
    double  dist;
    Punkt p1,p2;

    public Distance(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;
        dist = Punkt.odl(p1,p2);
    }

    @Override
    public String toString() {
        return "Distance{" +
                "dist=" + dist +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
