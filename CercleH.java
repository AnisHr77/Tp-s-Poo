package models;



public class CercleH extends Point{

    protected double rayon ;
    protected String color ;
    public CercleH(int x, int y, double rayon, String color){
        super(x,y) ;
        this.rayon = rayon ;
        this.color = color ;
    }
    public CercleH(){


    } ;

    public double getRayon(){
        return this.rayon ;
    }
    public void setRayon(double R){
        this.rayon = R ;
    }
    public String getColor(){
        return this.color ;
    }
    public void setColor(String C){
        this.color = C ;
    }
    public Point getCentre(){
        return new Point (getx(),gety()) ;
    }
    public void setCentre(Point P){
        setx(P.getx());
        sety(P.gety()); ;
    }
    public double sureface(){
        return (Math.PI*Math.pow(rayon,2)) ;
    }
    public double Perimetre(){
        return (2*Math.PI*rayon) ;
    }
    public void afficher(){
        super.afficher();
        System.out.println("rayon = "+rayon) ;
        System.out.println("color = "+color) ;
    }
    public String ToString(){
        return ("x = "+getx()+"\n y = "+gety()+"\n color = "+color+"\n rayon = "+rayon) ;
    }
    public boolean equals(Object O){
        if( (this == null) || (O == null)|| (O.getClass() != this.getClass())){
            return false ;
        }else
        {
            CercleH C = (CercleH) O ;
            return  super.equals(C.getCentre()) && this.color.equals(C.color) && this.rayon == C.rayon ;
        }
    }
}