package models;

public class CercleOrd extends Cercletp implements Comparable{
    public CercleOrd(String couleur, Point pointInitial, double rayon) {
        super(couleur, pointInitial, rayon);
    }

    public int compareTo(Object o) {
        Cercletp c = (Cercletp) o;
        if(this.surface()<c.surface()){
            return -1;
        }
        else{
            if(this.surface()>c.surface()){
                return 1;
            }
            else return 0;
        }
    }
}