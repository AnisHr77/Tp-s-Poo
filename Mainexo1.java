public class Mainexo1 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Adresse adresse1 = new Adresse("Rue A", "Ville X");
        Personne p1 = new Personne("Anis", 20, adresse1);


        Personne p2 = (Personne) p1.clone();

        System.out.println("Avant modification :");
        p1.afficher();
        p2.afficher();

        p2.setNom("Walid");
        p2.getAdresse().setRue("Rue B");

        System.out.println("Après modification de p2 :");
        p1.afficher();
        p2.afficher();
    }
}