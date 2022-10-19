package td4;

import java.util.Scanner;
public class exo9 {
     public static void main(String[] args) {
          try (Scanner clavier = new Scanner(System.in)) {
               System.out.println("Combien de valeurs voulez vous donner ? ");
               int nbvaleur = clavier.nextInt();
               int max = 0;
               int min = 0;
               int i = 1;
               while(i<=nbvaleur){
                    System.out.println("Donnez une autre valeur :  ");
                    int valeur = clavier.nextInt();
                    if(valeur>max){
                         max = valeur;
                    }
                    if(valeur<min){
                         min = valeur;
                    }
                    i = i + 1;
               }
                    System.out.println("Voici la valeure maximale :");
                    System.out.println(max);
                    System.out.println("Voici la valeure minimal :");
                    System.out.println(min);
          }
}
}

