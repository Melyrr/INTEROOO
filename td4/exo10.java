package td4;

import java.util.Scanner;
public class exo10{
    public static void main(String[] args) {
          try (Scanner clavier = new Scanner(System.in)) {
               System.out.println("Entrez des nombres entiers positifs (terminez par un nombre négatif)  :  ");
               int valeur = clavier.nextInt();
               int sentinelle = -1;
               int premier = valeur;
               int dernier = valeur;
               while (valeur > sentinelle) {
                    dernier = valeur;
                    System.out.println("Entrez un nouveau nombre entier positif: ");
                    valeur = clavier.nextInt();
               }
               if (premier <= sentinelle) {
                    System.out.println("Le série est vide");
               }else if (premier < dernier) {
                    System.out.println("Le premier est inférieur au dernier  ");
               }else if (premier > dernier) {
                    System.out.println("Le premier est supérieur au dernier  ");
               }else {
                    System.out.println("Le premier est égal au dernier   ");
               }
     }
}
}