import java.util.Scanner;

public class Edad {
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int edad;
		System.out.println("Dime tu edad");
		edad=Integer.parseInt(teclado.nextLine());
		if(edad<18) {
			System.out.println("La persona es menor de edad");
		}else {
			System.out.println("La persona es mayor de edad");
		}
	}

}
