package models;

import java.sql.SQLOutput;

public class Cylindre extends Point {
private double hauteur ;
    private double rayon ;
public Cylindre () {

}
public Cylindre ( int x ,int y ,  double rayon , String couleur , double hauteur){
    super( x,y);
    this.rayon = rayon ;
    this.hauteur = hauteur ; }
public double volumeCylindre (){
    return Math.PI * Math.pow(rayon,2)*hauteur ;

}
public String toString (){
    return super.toString() +"et ca hauteur egale"+ hauteur ;
}
@Override
public void afficher ()
{
    super.afficher();
    System.out.println("la heauteur"+hauteur);
}}





