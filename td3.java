import java.util.Scanner;
public class td3 {
    public static void main(String[] args) {
        exo1();
    }
    public static void exo1(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez votre age svp");
        int a =  clavier.nextInt();
        if(a>=18){
            System.out.println("Vous êtes majeur");
        }else{
                System.out.println("Vous êtes mineur !");
            }

        }
    public static void exo2(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez un nombre svp");
        int a =  clavier.nextInt();
        if(a%2==0){
            System.out.println("Ce nombre est pair ");
        }else{
                System.out.println("Ce nombre est impair !");
            }
        }
        public static void exo3(){
            Scanner clavier = new Scanner(System.in);
            System.out.println("Veuillez entrez deux nombrees svp");
            int a =  clavier.nextInt();
            int b =  clavier.nextInt();
            if(a>b){
                System.out.println("Ce nombre est le plus grand !"+a);
            }else{
                    System.out.println("Ce nombre est le plus grand !"+b);
                }
        }
        public static void exo6(){
            Scanner clavier = new Scanner(System.in);
            System.out.println("Veuillez entrez trois nombrees svp");
            int a =  clavier.nextInt();
            int b =  clavier.nextInt();
            int c =  clavier.nextInt();
            if(a>b && a>c){
                System.out.println("Ce nombre est le plus grand !"+a);
            }else if(b>a && b>c){
                    System.out.println("Ce nombre est le plus grand !"+b);
                }
            else{
                System.out.println("Ce nombre est le plus grand !" + c);
            }
        }
        public static void exo7(){
            Scanner clavier = new Scanner(System.in);
            System.out.println("Veuillez entrez la longueur des cotés d'un triangle svp");
            int a =  clavier.nextInt();
            int b =  clavier.nextInt();
            int c =  clavier.nextInt();
            if(a==b && a==c){
                System.out.println("Ce triangle est équilattéral!");
            }else if(b==a || b==c){
                    System.out.println("Ce triangle est isocèle !");
                }
            else{
                System.out.println("Ce triangle est quelconque !");
            }
        }
    }
    

