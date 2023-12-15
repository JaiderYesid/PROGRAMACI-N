import java.util.Random;
import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("dijite el numero de intentos que quiere hacer");
    
            int intentosMaximos = scanner.nextInt(); 
            int intentosRealizados = 0; 
        
        while (intentosRealizados < intentosMaximos) {
            
            int dado1 = rand.nextInt(6) + 1;
            int dado2 = rand.nextInt(6) + 1; 

            System.out.println("DADO 1: " + dado1);
            System.out.println("DADO 2: " + dado2);

            if (dado1 == dado2) {
                System.out.println("Felicidades, ganaste ");
                break;
            } else {
                System.out.println("no sacaste par, sigue intentando");
                intentosRealizados++;
                if(intentosRealizados < intentosMaximos) {
                    System.out.println("Te quedan " + (intentosMaximos - intentosRealizados) + " intentos.");
                    System.out.println("oprime ENTER para lanzar los dados");
                    scanner.nextLine(); 
                }
            }
        }

        if (intentosRealizados == intentosMaximos) {
            System.out.println("Se acabaron tus intentos, Has perdido");
        }

        scanner.close();

 }


	}
