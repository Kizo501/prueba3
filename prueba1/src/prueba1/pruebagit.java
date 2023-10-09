package prueba1;

import java.util.Scanner;

public class pruebagit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, num2;
		
		System.out.println("Introduce un numerooooo y se suma");
		num = sc.nextInt();
		System.out.println("Introduce el segundoooooooo numero");
		num2 = sc.nextInt();
		
		int resultado = num + num2;
		
		System.out.println(resultado);
		
	}

}
