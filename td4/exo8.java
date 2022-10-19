package td4;

import java.util.Scanner;
public class exo8{
     public static void main(String[] args) {
          try (Scanner clavier = new Scanner(System.in)) {
               int i =1;
               System.out.println("Donnez moi le nombre de valeurs que vous voulez introduire :  ");
               int valeurmax = clavier.nextInt();
               int max = 0;
               while(i<=valeurmax) {
                    System.out.println("Donnez une valeur :  ");
                    int valeur = clavier.nextInt();
                    if(valeur>max){
                         max = valeur;
                    }
                    i++;
               }
               System.out.println("Voici la valeure maximale :");
               System.out.println(max);
          }
}
}