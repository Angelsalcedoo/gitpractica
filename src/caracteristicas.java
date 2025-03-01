
import java.util.Scanner;

public class caracteristicas {
    public static void main(String[] args) throws Exception {
       
     Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese su nombre ");
    String Nombre = scanner.nextLine();
    System.out.println("ingrese su edad");
    int Edad = scanner.nextInt();
    System.out.println("ingrese su estatura");
    Nombre = scanner.nextLine();
    double Estatura = scanner.nextDouble();

    System.out.println("Hola, " + Nombre + ". Tienes " + Edad + " años y mides " + Estatura + " metros.");
    }

}