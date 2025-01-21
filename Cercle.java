package models ;

public class Cercle {
    private static int count = 0;
    private Point center;
    private double rayon;

    public Cercle(int x, int y, double rayon) {

        center = new Point(x, y);
        this.rayon = rayon;
    }

    public Cercle(Point p, double rayon) {
      ;
        center = p;
        this.rayon = rayon;
    }

    public void deplacer(int dx, int dy) {
        center.deplacer(dx, dy);
    }

    public void afficher() {
        System.out.println("x=" + center.getx());
        System.out.println("y=" + center.gety());
        System.out.println("rayon=" + rayon);
    }
}
