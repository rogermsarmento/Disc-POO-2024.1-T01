package br.edu.pricipal;

import java.util.Scanner;

/**
 * QR01 - Faça um programa que receba quatro números 
 * inteiros, calcule e mostre a soma desses números.
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n1, n2, n3, n4;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = sc.nextInt();
		
		System.out.println("Digite o quarto numero: ");
		n4 = sc.nextInt();
		
		int soma = n1 + n2 + n3 + n4;
		
		System.out.println("A soma dos numros foi: " + soma);

	}

}
