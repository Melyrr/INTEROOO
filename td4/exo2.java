package td4;

import java.util.Scanner;
public class exo2 {
     
     public static void main(String[] args) {
          try (Scanner clavier = new Scanner(System.in)) {
               int i = 1;
               System.out.print("Donnez moi un chiffre :  ");
               int valeur = clavier.nextInt();
               while(i<=valeur) {
                    System.out.print("-");
                    i = i+1;
               }
          }
}
}
