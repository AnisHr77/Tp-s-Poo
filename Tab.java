import java.util.Scanner;
public class Tab {
    public static void main (String args[]) {

        int taille ;

        int tab []=new int[args.length];
        for (int j=0 ; j<args.length;j++){
            System.out.println("Donner le"+(j+1)+"element " );

        }
        int max = tab[0], min = tab[0], somme = 0;
        for (int i = 0; i<taille; i++) {
            if (tab[i] > max) max = tab[i];
            if (tab[i] < min) min = tab[i];
            somme += tab[i];
        }
        System.out.println("valeur maximale = " + max);
        System.out.println("valeur minimale = " + min);
        double moy = (double)somme / taille;
        System.out.printf("moyenne   %.2f" , moy);
    }}