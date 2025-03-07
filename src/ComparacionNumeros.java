import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        // Evaluar la condición usando operadores de comparación y lógicos
        if (num1 > num2 && num1 < num3) {
            System.out.println("El primer número es mayor que el segundo y menor que el tercero.");
        } else {
            System.out.println("El primer número no cumple la condición.");
        }
        
        scanner.close();
    }
}

    

