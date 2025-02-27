package exo5;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) throws CoordonneException {
        if (x < 0 || y < 0) {
            throw new CoordonneException("Coordonnées invalides");
        }
        this.x = x;
        this.y = y;
    }

    public void deplacer(int dx, int dy) throws DeplacementException{
        if (x + dx < 0 || y + dy < 0) {
            throw new DeplacementException("Déplacement invalide");
        }
        x += dx;
        y += dy;
    }
    public void afficher(){
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}

