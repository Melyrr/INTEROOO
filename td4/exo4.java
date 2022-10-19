package td4;

import java.util.Scanner;
public class exo4 {
     public static void main(String[] args) {
          try (Scanner clavier = new Scanner(System.in)) {
               int i =1;
               while(i<=10) {
                    System.out.println("Donnez moi 10 nombres :  ");
                    int valeur = clavier.nextInt();
                    if(valeur % 2 ==0){
                         System.out.println("Ce nombre est pair !");
                    }
                    else{
                         System.out.println("Ce nombre est impair !");

                    }
                    i++;
               }
          }
}
}