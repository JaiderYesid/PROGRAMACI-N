public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String producto = "Televisor";
		String categoria;
		switch (producto) {
		    case "Camisa":
		    case "Pantalón":
		    case "Vestido":
		        categoria = "Ropa";
		        break;
		    case "Televisor":
		    case "Computadora":
		    case "Teléfono":
		        categoria = "Electrónica";
		        break;
		    default:
		        categoria = "Categoría desconocida";
		}
		System.out.println("El producto pertenece a la categoría: " + categoria);
	}

}
