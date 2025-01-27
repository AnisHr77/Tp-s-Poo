import java.util.Scanner ;



public class Sum
{
    public static void main(String[] args) {
        double n;
        double s=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le rang de la suite ");
        n=sc.nextDouble();
        for(double i=1;i<=n ; i++)
        { s=s+1/i;}
        System.out.println("La somme egale "+s );
    }
}