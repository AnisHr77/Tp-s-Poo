package EXO2;

public class MathOperations {
    public void calcule(int a, int b) {
        class Operations {
            int somme() {
                return a + b;
            }

            int difference() {
                return a - b;
            }

            int produit() {
                return a * b;
            }

            double quotient() {
                try {
                    return (double) a / b;
                } catch (ArithmeticException e) {
                    System.out.println("Erreur: " + e.getMessage());
                    return Double.NaN; // Retourner NaN en cas de division par zéro
                }
            }
        }

        Operations ops = new Operations();
        System.out.println("Somme = " + ops.somme());
        System.out.println("Différence = " + ops.difference());
        System.out.println("Produit = " + ops.produit());
        System.out.println("Quotient = " + ops.quotient());
    }
}