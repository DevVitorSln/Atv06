import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

        Scanner scanner = new Scanner(System.in);
 
        double valorRaioCirculo, valorAreaCirculo;

        System.out.println("Raio do círculo: ");
        valorRaioCirculo = scanner.nextDouble();

        valorAreaCirculo = Math.PI * valorRaioCirculo * valorRaioCirculo;;

        System.out.println("Área do círculo: " + valorAreaCirculo);
    }
}
