package Exo3;
import java.util.Arrays;

public class TabOrdonner {


        public static class Ordonneur {
            public static void Ordonner (int[]tab){
                Arrays.sort(tab);
            }
            public static void affichertab(int[]tab){
                System.out.println(Arrays.toString(tab));
            }

        }

}
