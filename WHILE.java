public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;

		while (true) {
		    System.out.println("Contador: " + contador);
		    contador++;
		    
		    if (contador == 10) {
		        break; // Salir del bucle
		    }
		}


	}

}
