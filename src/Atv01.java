import java.util.Scanner;

public class Atv01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 1;
        int resultado;

        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();

        while (contador <= 10) {
            resultado = numero * contador;
            System.out.println(numero + " X " + contador + " = " + resultado);
            contador++;
        }
    }
}
