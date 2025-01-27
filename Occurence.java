import java.util.Scanner;
public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taille ;
        System.out.println("Donner la taille de tableaux");
        taille=sc.nextInt();
        int []tab = new int[taille];
        for (int i=0 ; i<taille;i++)
        {
            tab[i]= sc.nextInt();
        }
        int occ=0 ;
        int val ;
        System.out.println("Donner la valeur que vous avez entrein de chercher ");
        val=sc.nextInt();
        for (int j=0 ; j<taille ;j++){
            if (tab[j]== val)
            {
                occ++ ;
                System.out.println("la valeur "+val+" se presente dans l'indice  "+j);
            }
            System.out.println("le nombre d'occurence de la valeur : "+val+" est : "+occ);
        }

    }
}