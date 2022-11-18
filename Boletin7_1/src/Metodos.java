public class Metodos {
    public void tresNumeros(short num1,short num2,short num3){
        if(num1 > num2 && num1 > num3){
            System.out.println("el numero 1 es mayor");
        } else if (num2 >num1 && num2 > num3) {
            System.out.println("el numero 2 es el mayor");
        }else {
            System.out.println("el numero 3 es el mayor");
        }
    }
}
