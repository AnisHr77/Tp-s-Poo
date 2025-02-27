package exo4;

public class Main {
    public static void main(String[] args) {
        Pile pile = new Pile();

        try {
            for (String arg : args) {
                int valeur = Integer.parseInt(arg);
                pile.empiler(valeur);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (PilePleineException e) {
            System.out.println(e);
        }

        try {
            do {
                System.out.println(pile.depiler());
            } while (true);
        } catch (PileVideException e) {
            System.out.println(e);
        }
    }
}
