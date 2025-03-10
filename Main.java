package Exo3;

public class Main {
    public static void main(String[] args) {
        int[] tab = {3, 5, 1, 10, 7};

        // Appeler affichertab depuis Ordonneur
        TabOrdonner.Ordonneur.affichertab(tab);

        // Trier le tableau
        TabOrdonner.Ordonneur.Ordonner(tab);

        // Afficher à nouveau après le tri
        TabOrdonner.Ordonneur.affichertab(tab);
    }
}
