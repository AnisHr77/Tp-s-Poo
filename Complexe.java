package models;

public class Complexe {
    private  double x ;
    private  double y ;
    public Complexe(double x , double y ){
        this.x= x ;
        this.y = y;
    }
    public Complexe() {}
    public Complexe plusComplexe(Complexe z ){
       return new Complexe(this.x+z.x , this.y+z.y) ;

    }
    public Complexe moinComplexe(Complexe z ){
        return new Complexe(this.x-z.x , this.y-z.y) ;
    }
    public void afficher (){
    if (this.y==0){
        System.out.println(" le nombre egale  : "+this.x);}
        else if(this.y>0){
            if (this.y==1){
            System.out.println("le nombre comblexe Z= "+this.x+"+i");}
            else {
                System.out.println("le nombre egal Z="+this.x+"+"+this.y+"i");}}
            else if (this.y<0){
                if (this.y==-1){
                System.out.println("le nombre comblexe Z= "+this.x+"-i");}

            else {
                System.out.println("le nombre egal Z= "+this.x+"-"+this.y+"i");
            }}




}}
