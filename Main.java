package exo5;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean noProblem=false;
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.print("Entrer le coordonnee x: ");
                int x=sc.nextInt();
                System.out.print("Entrer le coordonnee y: ");
                int y=sc.nextInt();
                Point P1=new Point(x,y);
                P1.afficher();
                boolean noProblem2=false;
                do{
                    try{
                        System.out.print("Entrer le deplacement du coordonnee x: ");
                        int dx=sc.nextInt();
                        System.out.print("Entrer le deplacement du coordonnee y: ");
                        int dy=sc.nextInt();
                        P1.deplacer(dx,dy);
                        P1.afficher();
                        noProblem2=true;
                    }
                    catch(DeplacementException e){
                        System.out.println(e.getMessage());
                    }
                    catch(InputMismatchException e){
                        System.out.println("Input: "+e.getMessage());
                    }
                }while(!noProblem2);
                sc.close();
                noProblem=true;
            }
            catch(CoordonneException e){
                System.out.println(e.getMessage());
            }
            catch(InputMismatchException e){
                System.out.println("Input: "+e.getMessage());
            }
        }while(!noProblem);
    }
}