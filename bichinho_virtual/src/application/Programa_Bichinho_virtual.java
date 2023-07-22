package application;

import java.util.Locale;
import java.util.Scanner;
import entities.bichinho;

public class Programa_Bichinho_virtual {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do seu bichinho:");
		String nome = sc.next();
		
		System.out.println("Que tipo de bichinho ele é?");
		System.out.println("1 - Dinossauro");
		System.out.println("2 - Morcego ");
		System.out.println("3 - Galinha ");
		System.out.println("4 - Cachorro ");
		
		int tipo = sc.nextInt();
		
		String tipoNome = "";
		
		switch (tipo) {
		case 1:
			tipoNome= "Dinossauro";
		break;
		case 2: 
			tipoNome="Morcego";
			break;
		case 3: 
			tipoNome="Galinha";
			break;
		case 4: 
			tipoNome="Cachorro";
			break;
		}
		
		int idade = 0;
		int calorias = 50;
		int forca = 0;
		
		bichinho Bichinho = new bichinho(nome, tipoNome, idade, calorias, forca);
		
		System.out.println(Bichinho.nascer());
		
		System.out.println("Gostaria de alimentar o bichinho?");
		System.out.println();
		System.out.println("1 - Sim  | 2 - Não");
		int alimentar = sc.nextInt();
		if(alimentar == 1) {
			System.out.println("Escolha a comida que você deseja: ");
		
			System.out.println("1 - Cenoura: 20cal");
			System.out.println("2 - Maçã: 15cal ");
			System.out.println("3 - Frango: 50cal ");
			System.out.println("4 - Peixe: 40cal ");
			
			int comida = sc.nextInt();
			String tipoComida = "";
			
			switch (comida) {
			case 1:
				tipoComida= "Cenoura";
			break;
			case 2: 
				tipoComida="Maçã";
				break;
			case 3: 
				tipoComida="Frango";
				break;
			case 4: 
				tipoComida="Peixe";
				break;
			}
		}
	
	sc.close();
	
	
	
}}
