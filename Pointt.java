package models;

public class Pointt {
    int x ,y;


    public Pointt (int x , int y  ){
        this.x = x ;
        this.y=y ;
    }
    public Pointt() {};

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y){
        this.y = y ;
    }
    public int getX(){
        return x ;
    }

    public int getY() {
        return y;
    }
    public void deplacer (int dx , int dy) {
        this.x = x+dx ;
        this.y =y+dy ;
    }
    public void afficher (){
        System.out.println(" le x = "+x+" le y =  "+y);
    }

}
