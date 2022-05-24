import java.util.Scanner;

public class ProgramaEjemplo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b;
        System.out.println("Digite dos números: ");
        a = leer.nextInt();
        b = leer.nextInt();

        if(a>b){
            System.out.println("El mayor es "+a);
        }else{
            System.out.println("El mayor es "+b);
        }
    }
}
