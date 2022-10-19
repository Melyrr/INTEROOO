package td4;

import java.util.Scanner;
public class exo1 {
     public static void main(String[] args) {
          try (Scanner clavier = new Scanner(System.in)) {
               int i = 1;
               System.out.print("Donnez moi un chiffre :  ");
               int valeur = clavier.nextInt();
               while(i<=valeur) {
                    System.out.println(i);
                    i = i+1;
               }
               System.out.println("Et maintenant les valeurs pairs !");
               i = 1;
               while(i<=valeur){
                    if(i % 2 == 0){
                         System.out.println(i);
                    }
                    i++;
    }
               System.out.println("Et maintenant les valeurs entre -n et n !");
               int valeur2 = -valeur;
               while(valeur2<=valeur){
                         System.out.println(valeur2);
                         valeur2++;
    }
               System.out.println("Et maintenant les multipes de 5 entre 1 et n !");
               i = 1;
               while(i<=valeur){
                    if(i % 5 == 0){
                         System.out.println(i);
                    }
                    i++;
               }          
               System.out.println("Et maintenant les multiples de n compris entre 1 et 100 !");
               i = 1;
               while(i<=100){
                    if(i % valeur == 0){
                         System.out.println(i);
                    }
                    i++;
}
          }
}
}