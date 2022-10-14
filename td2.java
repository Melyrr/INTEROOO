import java.io.PipedWriter;
import java.util.Scanner;;
public class td2 {
    public static void main(String[] args) {
        exo1();
        exo2();
        exo3();
        exo4();
        exo5();
        exo6();
        exo7();
        exo8();
        exo9();
    }
    public static void exo1() {
            int a = 51;
            int b = 17;
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);
            System.out.println(a*a+b*b);
    }
    public static void exo2(){
        double a = 2.5;
        double b = 3.3;
        double c = 4.9;
        System.out.println(4*a*c);
        System.out.println(b*b-4*a*c);
    }
    public static void exo3(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez la longueur d'un côté du carré (nombre entier):  ");
        int taille = clavier.nextInt();
        int aire = taille*taille;
        System.out.println("Votre carré a une aire de " + aire +"cm².");
    }
    public static void exo4(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez la longueur du rayon du cercle (nombre décimal):  ");
        double taille = clavier.nextDouble();
        double périmètre = 2*3.141593*taille;
        double aire = 3.141593*taille*taille;
        System.out.println("Votre cercle a un périmètre de "+périmètre+"cm et une aire de "+aire+"cm²");
    }
    public static void exo5(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez deux nombres entiers : ");
        int a = clavier.nextInt();
        int b = clavier.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*a+b*b);
    }
    public static void exo6(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entre un nombre entier : ");
        int nb = clavier.nextInt();
        System.out.println("Voici les unités : "+nb%10);
        System.out.println("Voici les dizaines : "+(nb/10)%10); 
        System.out.println("Voici les centaines : "+(nb/100)%10);    
    }
    public static void exo7(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entre un nombre compris entre 100 et 999");
        int nb = clavier.nextInt();
        if(nb<100 || nb>999 ){
            System.out.println("Le nombre que vous avez entré n'est pas compris entre 100 et 999.");
        }else{
            int unités = nb%10;
            int dizaines = (nb/10)%10;
            int centaines = (nb/100)%10;
            System.out.print(unités);
            System.out.print(dizaines);
            System.out.print(centaines);
        }
    }
    public static void exo8(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez un nombre de secondes : ");
        int secondes = clavier.nextInt();
        int minutes = secondes/60;
        System.out.println("Cela correspond à "+minutes+" minutes.");
    }
    public static void exo9(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez le nombres d'heures : ");
        int heure = clavier.nextInt();
        System.out.println("Maintenant le nombre de minutes : ");
        int minutes = clavier.nextInt();
        System.out.println("Et enfin le nombre de secondes : ");
        int secondes = clavier.nextInt();
        System.out.print("Voici le nombre de secondes totales : ");
        System.out.println(heure*3600+minutes*60+secondes + " secondes.");
    }
}
