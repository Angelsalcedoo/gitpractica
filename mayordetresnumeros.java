import java.util.Scanner;

public class mayordetresnumeros {
    public static void main(String[] args) {
        Scanner scanner = new scanner(system.in);

        System.out.println("ingrese el primer nuemro");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2 = scanner.nextInt();
        System.out.println("ingrese el tercer numero");
        int numero3 = scanner.nextInt(),

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("el mayyor es:"+ numero1);
        }else if(numero2 > numero1 && numero2 > numero3);{
            System.out.println("El mayor es: " + numero2);
        } else {
            System.out.println("El mayor es: " + numero3);
        }
    }
}
