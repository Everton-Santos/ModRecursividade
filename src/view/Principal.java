package view;

import controller.ModController;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//M?todo construtor
		ModController md = new ModController();
		
		//Recebendo o primeiro n?mero
		System.out.println("Digite o primeiro n?mero: ");
		double numero = sc.nextDouble();
		
		//Recebendo o segundo n?mero
		System.out.println("Digite o segundo n?mero: ");
		double numerocont = sc.nextDouble();
		
		double resultado = md.mod(numero, numerocont);
		

		System.out.println("O n?mero aparece "+resultado+" vezes.");

	}

}
