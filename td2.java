import java.util.Scanner;;
public class td2 {
    public static void main(String[] args) {
       
        exo1();
        exo2();
        exo3();

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
}

