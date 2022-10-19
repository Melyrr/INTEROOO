import java.util.Scanner;
public class td4 {
    public static void main(String[] args) {
        exo4();
    }
    public static void exo1(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez un entier");
        int a = clavier.nextInt();
        int c = 1;
        while(c<=a){
            System.out.println(c);
            c =c  +1;
        }
    }
    public static void exo2(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("veuillez donne run nombre");
        int a = clavier.nextInt();
        int b = 0;
        while(b<a){
            System.out.print("-");
            b++;
        }
    }
    public static void exo4(){
        Scanner clavier = new Scanner(System.in);
        int snetinelle = 0;
        System.out.println("Entrez 10 valeurs");
        while(snetinelle < 10) {
        int valeur = clavier.nextInt();
        if(valeur%2==0){
        System.out.println("Ce nombre est pair !");
        }else{
            System.out.println("Ce nombre est impair !");
        }
        snetinelle = snetinelle+1;
        }

        }
    }
    
