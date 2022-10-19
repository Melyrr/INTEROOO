package td4;

import java.util.Scanner;
public class exo6 {
     public static void main(String[] args) {
          try (Scanner clavier = new Scanner(System.in)) {
               int i =1;
               System.out.println("Donnez moi le nombre de valeurs que vous voulez introduire :  ");
               int valeurmax = clavier.nextInt();
               int positif = 0;
               int nul = 0;
               int négatif = 0;
               while(i<=valeurmax) {
                    System.out.println("Donnez une valeur :  ");
                    int valeur = clavier.nextInt();
                    if(valeur>0){
                         positif++;
                    }
                    if(valeur<0){
                         négatif++;
                    }
                    if(valeur==0){
                         nul++;
                    }
                    i++;
               }
               System.out.println("Voici le nombre de valeurs positifs :");
               System.out.println(positif);
               System.out.println("Voici le nombre de valeurs négatif :");
               System.out.println(négatif);
               System.out.println("Voici le nombre de valeurs nul :");
               System.out.println(nul);
          }
}
}