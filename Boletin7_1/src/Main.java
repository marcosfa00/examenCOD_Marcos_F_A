import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos ej5 = new Metodos();
        System.out.println("introduce el primer número");
        short num1 = sc.nextShort();
        System.out.println("introduce el segundo número");
        short num2 = sc.nextShort();
        System.out.println("introduce el tercer número");
        short peso1 = sc.nextShort();
        ej5.tresNumeros(num1,num2,peso1);


    }
}