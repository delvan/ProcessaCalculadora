package com.aula.java;
import java.util.Scanner;
public class Caculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer valor1 = 0;
		Integer valor2 = 0;
		int result = 0;
		int opcao;
		String[] menu = { "1 - ADI��O", "2 - SUBTRA��O", "3 - MULTIPLICA��O", "4 - DIVIS�O", "5 - SAIR" };
		do {
			System.out.println("========================");
			System.out.println("------CALCULADORA-------");
			System.out.println("========================");
			for (int i = 0; i < menu.length; i++) {
				System.out.println(menu[i]);
			}
			System.out.println("Digite 1� valor: ");
			valor1 = teclado.nextInt();
			System.out.println("Digite o 2� valor: ");
			valor2 = teclado.nextInt();
			System.out.println("Digite uma op��o do MENU");
			opcao = teclado.nextInt();
			
			if(opcao  >= 1 & opcao <=5)
			switch (opcao) {
			case 1:
				result = valor1 + valor2;
				System.out.println("Adi��o " + valor1 + " + " + valor2 + " = " + result);
				break;
			case 2:
				result = valor1 - valor2;
				System.out.println("Subtra��o " + valor1 + " - " + valor2 + " = " + result);
				break;
			case 3:
				result = valor1 * valor2;
				System.out.println("Multiplica��o " + valor1 + " x " + valor2 + " = " + result);
				break;
			case 4:
				result = valor1 / valor2;
				System.out.println("Divis�o " + valor1 + " / " + valor2 + " = " + result);
				break;
			default:
				System.out.println("Voc� saiu: ");
				break;
			}else {
				System.out.println("Op��o invalida !");
			}
		} while (opcao != 5);
		teclado.close();

	}

}
