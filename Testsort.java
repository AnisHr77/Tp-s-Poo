import java.util.Arrays;
import java.util.Scanner;

public class Testsort {
        public static void main(String[] args) {
            int tab[] = new int[args.length] ;
        for (int i=0 ; i< args.length ; i++){

            tab[i] = Integer.parseInt(args[i]) ;
        }
            Arrays.sort(tab);
            for (int i = 0; i < tab.length; i++)
            {  System.out.print(tab[i]+" ");}

        } }
            /* Scanner sc = new Scanner(System.in) ;
            int N ;
            System.out.println("Donner la taille du tableaux : ");
            N=sc.nextInt() ;

            int[] tab1= new int [N];
            for(int i= 0 ; i<N ; i++ ) {
                System.out.println("donner le "+(i+1)+"element  =");

                tab1[i]=sc.nextInt() ;
            }
           for (int num:tab1)
           {
                System.out.print(num +" ");
           }
            System.out.println("");

           Arrays.sort(tab1);
            for (int i = 0; i < tab1.length; i++)
                System.out.print(tab1[i]+" ");


            int []tab2 ={3,5,6,1,19};
            int []tab3 ={2,3,5,6,100};
        System.arraycopy(tab2,1,tab3,1, 3);
            System.out.println();
        for (int i = 0; i < tab3.length; i++)
                System.out.print(tab3[i]+" ");
    }*/
