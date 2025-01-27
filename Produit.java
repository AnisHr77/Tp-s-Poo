import java.util.Scanner;
public class Produit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b ;
        System.out.print("Donner le premier nombre :");
        a=sc.nextInt();
        System.out.print("Donner le deuxieme nombre :");
        b=sc.nextInt();
        double P=a*b;
        System.out.println("la multiplication entre "+a+" et "+b+" egale = "+P);
    }
}