package td4;

import java.util.Scanner;
public class exo5 {
     public static void main(String[] args) {
          try (Scanner clavier = new Scanner(System.in)) {
               int i =1;
               int somme = 0;
               System.out.println("Donnez moi le nombre de numéro que vous voulez introduire :  ");
               int valeurmax = clavier.nextInt();
               while(i<=valeurmax) {
                    System.out.println("Donnez un nombre :  ");
                    int valeur = clavier.nextInt();
                    somme = somme + valeur;
                    i++;
               }
               System.out.println("Voici la somme et la moyenne :");
               System.out.println(somme);
               System.out.print(somme/valeurmax);
          }
}
}