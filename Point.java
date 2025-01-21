
package models;
import models.Cercle ;
import models.Cerclek ;

public class Point {
    private static int cpt = 0;


    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        cpt++;
    }

    public static int getCpt() {
        return cpt;
    }

    public Point() {
        this(0, 0);
    }

    public void setx(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public void deplacer(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void afficher() {
        System.out.println("x="+getx() + ",y=" + gety());
    }


    public void rotation(double alpha) {
        double r = Math.sqrt(x * x + y * y);
        double t = Math.atan2(x, y);
        t += alpha;
        x = (int) (r * Math.cos(t));
        y = (int) (r * Math.sin(t));
    }
}
