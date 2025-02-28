import java.util.Scanner;

public  class media {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero ");
        int numero2 = scanner.nextInt();
        System.out.println("ingrese el tercer numero");
        int numero3 = scanner.nextInt();
        
        double media = (numero1 + numero2 + numero3)/3;
        System.out.println("media de los tres numeros"+ media );
        

    }      
}  
    
