package td4;

import java.util.Scanner;
public class exo3 {
     public static void main(String[] args) {
          try (Scanner clavier = new Scanner(System.in)) {
               int i =1;
               int somme = 0;
               while(i<=5) {
                    System.out.println("Donnez moi 5 nombres :  ");
                    int valeur = clavier.nextInt();
                    somme = somme + valeur;
                    i++;
               }
               System.out.println("Voici la somme et la moyenne des 5 nombres :");
               System.out.println(somme);
               System.out.print(somme/5);
          }
}
}