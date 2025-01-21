package models;
import models.Point;
public class Cerclek extends  Point {
    protected double rayon;
    protected String couleur;

    public Cerclek(int x, int y, double rayon, String couleur) {
        super(x, y);
        this.rayon = rayon;
        this.couleur = couleur;
    }
    public Cerclek(){}

    public void setrayon(double rayon) {
        this.rayon = rayon;
    }

    public void setcouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setCenter(Point p) {
        setx(p.getx());
        sety(p.gety());
    }

    public double getRayon() {
        return rayon;
    }

    public String getCouleur() {
        return couleur;
    }

    public Point getCenter() {
        return new Point(x, y);
    }

    public double surface(double rayon) {
        return Math.PI * Math.pow(rayon, 2);
    }

    public double perimetre(double rayon) {

        return 2 * Math.PI * rayon;
    }
    @Override

    public void afficher () {
        super.afficher();
        System.out.println(" la couleur de cercle " + getCouleur());
        System.out.println("le rayon de cercle " + getRayon());
    }
        public String toString () {
     return "le x"+getx()+"le y "+gety()+"le rayon"+getRayon()+"la couleur"+getCouleur()   ;
    }

}