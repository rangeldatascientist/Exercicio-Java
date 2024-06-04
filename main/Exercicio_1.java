package main;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	float salario;
	float abono;
	float novoSalario;
	
	System.out.println("Digite seu salário:");
	salario = sc.nextFloat();
	System.out.println("Digite seu abono:");
	abono = sc.nextFloat();
	
	novoSalario = salario + abono;
	System.out.printf("Seu novo salário é:  %.2f",novoSalario);
	
	
	
	
	
	
	sc.close();
	

	}

}
