package exo6;

public class Cercle implements Comparable<Cercle> {
    private int x, y;
    private float rayon;


    public Cercle() {
        this.x = 0;
        this.y = 0;
        this.rayon = 1.0f;
    }


    public Cercle(Cercle C) {
        this.x = C.getX();
        this.y = C.getY();
        this.rayon = C.getRayon();
    }


    public Cercle(int absc, int ord, float r) {
        this.x = absc;
        this.y = ord;
        try {
            setRayon(r);
        } catch (RayonNegativeException e) {
            System.out.println(e.getMessage());
        }
    }

    // Getters et Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) throws RayonNegativeException {
        if (rayon < 0) {
            throw new RayonNegativeException("Rayon négatif détecté. Initialisation avec sa valeur absolue.");
        }
        this.rayon = Math.abs(rayon);
    }


    public void afficher() {
        System.out.println("x= " + x + " y= " + y + " Rayon= " + rayon);
    }


    public void changetaille(float coef) {
        try {
            setRayon(this.rayon * coef);
        } catch (RayonNegativeException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cercle c = (Cercle) obj;
        return this.x == c.x && this.y == c.y && this.rayon == c.rayon;
    }


    @Override
    public int compareTo(Cercle c) {
        return Float.compare(this.rayon, c.getRayon());
    }
}


