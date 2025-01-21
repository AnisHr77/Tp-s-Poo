package models;

    public class Cercletp extends  Form {
        private double rayon;


        public Cercletp(String Couleur , Point pointinitial ,double rayon ) {
            super(Couleur,pointinitial );
            this.rayon = rayon ;
        }
        public double surface() {
            return Math.PI * Math.pow(rayon, 2);
        }

        public double périmètre() {
            return 2 * Math.PI * rayon;
        }

        @Override
        public void afficher() {
            System.out.println("le rayon "+rayon+" la couleur "+getCouleur()+" le point initial "+getpointinitial());
        }

    }
