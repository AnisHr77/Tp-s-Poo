package models;

public class Carre extends Form {
private double cote ;

public Carre (String Couleur , Point pointinitial , double cote ){
    super(Couleur , pointinitial);
    this.cote = cote ;
}

public double surface () {
    return cote*cote ;
}
public double périmètre() {
    return 4*cote ;
}

    @Override
    public void afficher() {
        System.out.println("La couleur "+getCouleur()+" le point initiale "+getpointinitial()+" le cote egale "+cote);
    }

    @Override
    public void translation(int dx, int dy) {

    }
}
