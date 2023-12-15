import java.util.Scanner;

public class Dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String contraseña;
		do {
		    System.out.println("Ingrese su contraseña de 3 digitos: ");
		    contraseña = scanner.nextLine();
		} while (!contraseña.equals("123"));
		System.out.println("Contraseña correcta");
		scanner.close();
	}

}
