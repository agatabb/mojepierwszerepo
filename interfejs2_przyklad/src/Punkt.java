
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
