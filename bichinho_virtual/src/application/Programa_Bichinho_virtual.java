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
		
			System.out.println("1 - Cenoura: 10 energia");
			System.out.println("2 - Maçã: 15 energia ");			
			System.out.println("3 - Peixe: 20 energia ");
			System.out.println("4 - Frango: 25 energia ");
			
			int comida = sc.nextInt();
			String tipoComida = "";
			int energiaComida = 0;
			
			switch (comida) {
			case 1:
				tipoComida= "Cenoura";
				energiaComida = 10;
			break;
			case 2: 
				tipoComida="Maçã";
				energiaComida = 15;
				break;
			case 3: 
				tipoComida="Peixe";
				energiaComida = 20;				
				break;
				
			case 4: 			
				tipoComida="Frango";
				energiaComida = 25;
				break;
			}

			Bichinho.comer(tipoComida, energiaComida);
		}
		
		
		System.out.println();
		System.out.println("Gostaria de brincar? ");
		System.out.println("Gasto energético: 30 ");
		System.out.println("1 - Sim  | 2 - Não");
		int brincar = sc.nextInt();
		int energiaGasta = 0;
		if(brincar == 1) {
			forca += 10;
			energiaGasta = -30;
			
			
		}
		
		Bichinho.brincar(energiaGasta, forca);
		
		System.out.println();
		System.out.println("Gostaria de dormir? ");
		System.out.println("1 - Sim  | 2 - Não");
		int dormir = sc.nextInt();
		int energiaRecuperada = 0;
		if(dormir == 1) {
			 energiaRecuperada = 50;
		}
		
		Bichinho.dormir(energiaRecuperada);
	
	sc.close();
	
	
	
}}
