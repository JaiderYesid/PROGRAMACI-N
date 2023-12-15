import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numeroSecreto = 23;
		int intento;
		do {
		    System.out.println("Adivina el número secreto (entre 1 y 30): ");
		    while (!scanner.hasNextInt()) {
		        System.out.println("Entrada inválida. Ingrese un número válido: ");
		        scanner.next();
		    }
		    intento = scanner.nextInt();
		    if (intento < numeroSecreto) {
		        System.out.println("Numero bajo, Intenta nuevamente");
		    } else if (intento > numeroSecreto) {
		        System.out.println("Numero alto, Intenta nuevamente");
		    }
		} while (intento != numeroSecreto);
		System.out.println("Felicidades, Adivinaste el número secreto");
		scanner.close();

	}

}
