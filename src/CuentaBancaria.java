
public class CuentaBancaria {
    public static void main(String[] args) {
        // Declaración de variables
        int dineroInicial = 1000; // Dinero inicial en la cuenta
        int retiroPorSemana = 200; // Monto que se retira cada semana
        int semanasEnMes = 4; // Duración del mes en semanas

        // Calcular el monto total retirado durante el mes
        int montoTotalRetirado = retiroPorSemana * semanasEnMes;

        // Calcular el dinero final en la cuenta
        int dineroFinal = dineroInicial - montoTotalRetirado;

        // Mostrar el resultado
        System.out.println("Dinero restante al final del mes: $" + dineroFinal);
    }
}
