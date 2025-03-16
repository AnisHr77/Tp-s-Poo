class Personne implements Cloneable {

    private String nom;
    private int age;
    private Adresse adresse;

    public Personne(String nom, int age, Adresse adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    public void afficher() {
        System.out.println(nom + " " + age + " " + adresse.getRue() + " " + adresse.getVille());
    }

    public Adresse getAdresse() { return adresse; }

    public void setAdresse(Adresse adresse) { this.adresse = adresse; }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Personne cloned = (Personne) super.clone();
        cloned.adresse = (Adresse) this.adresse.clone(); // Clonage profond
        return cloned;
    }
}
