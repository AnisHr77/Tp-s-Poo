package exo4;

public class Pile {

    private int[] t;
    private int sommet;

    public Pile(){
            t = new int[10]; // Initialize array
            sommet = 0;

        }
    public Pile(int taille) {
        t = new int[taille]; // Initialize array
        sommet = -1; // Stack starts empty
    }



    public void empiler(int x) throws PilePleineException {
        if (sommet == 10) {
            throw new PilePleineException("exo4.Pile pleine");
        }
        t[sommet] = x;
        sommet++;
    }

    public int depiler() throws PileVideException {
        if (sommet == 0) {
            throw new PileVideException("exo4.Pile vide");
        }
        sommet--;
        return t[sommet];
    }

}
