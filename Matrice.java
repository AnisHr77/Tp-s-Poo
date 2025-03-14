import java.util.*;

public class Matrice {
    private int[][] T;

    public Matrice(int[][] tab) {
        T = tab;
    }

    public int sommeNPremier(int n) {
        int s = 0, cpt = 1, i = 0, j = 0;

        try {
            while (cpt <= n) {
                s += T[i][j];
                cpt++;
                j++;

                if (j == T[i].length) {
                    j = 0;
                    i++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erreur : n dépasse le nombre total d'éléments dans la matrice.");
            return -1; // Valeur d'erreur
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Vérification du nombre d'arguments
            if (args.length < 3) {
                throw new IllegalArgumentException("Trois arguments sont requis : N, M et n.");
            }

            // Conversion des arguments
            int N = Integer.parseInt(args[0]);
            int M = Integer.parseInt(args[1]);
            int n = Integer.parseInt(args[2]);

            // Vérification des tailles de matrice
            if (N <= 0 || M <= 0) {
                throw new IllegalArgumentException("N et M doivent être des entiers positifs.");
            }

            int[][] Tab = new int[N][M];

            System.out.println("Veuillez entrer les " + (N * M) + " éléments de la matrice :");

            for (int i = 0; i < Tab.length; i++) {
                for (int j = 0; j < Tab[i].length; j++) {
                    try {
                        Tab[i][j] = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println("Erreur : Veuillez entrer des nombres entiers.");
                        sc.next(); // Éviter une boucle infinie
                        j--; // Réessayer cette entrée
                    }
                }
            }

            Matrice mat = new Matrice(Tab);

            // Vérification de la validité de n
            if (n > N * M || n <= 0) {
                throw new IllegalArgumentException("n doit être compris entre 1 et " + (N * M));
            }

            System.out.println("Somme des " + n + " premiers éléments : " + mat.sommeNPremier(n));

        } catch (NumberFormatException e) {
            System.err.println("Erreur : Les arguments doivent être des nombres entiers.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erreur : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Une erreur inattendue s'est produite : " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
