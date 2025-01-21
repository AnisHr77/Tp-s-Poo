package models;

public abstract class Form implements Deplacable {
    protected String couleur ;
    protected Point pointinitial ;

   public  String getCouleur() {
        return couleur ;
    }
   public Point getpointinitial(){
        return pointinitial ;
    }
    public Form (String couleur , Point pointinitial){
        this.couleur = couleur ;
        this.pointinitial=pointinitial ;
    }

    public abstract double surface();
    public abstract double périmètre();
    public abstract void afficher() ;

    @Override
    public void rotation(double angle) {
        pointinitial.rotation(angle);
    }


    public void translation(int dx, int dy) {
        pointinitial.deplacer(dx , dy);
    }
}
