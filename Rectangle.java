package models;

public class Rectangle extends Form  {
 private double l  ;
 private double m ;

 public Rectangle (String couleur,Point pointinitial ,double l , double m )
 {  super(couleur ,pointinitial);
     this.l = l ;
     this.m = m ;
 }

    public void setL(double l) {
        this.l = l;
    }

    public void setM(double m) {
        this.m = m;
    }


    public double surface() {
        return l*m;
    }

    public double périmètre() {
        return 2*this.l + 2*this.m;
    }

    public void afficher() {
        System.out.println("la largeur "+m+" la longeur "+l+" the couleur "+getCouleur());
        pointinitial.afficher();

    }

}
