package com.wyden.poo.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.wyden.poo.modelos.Conta;

public class Banco {
	
	public static int menu(Scanner sc) {
		
		System.out.print("1. Inserir conta\n"+
				 	     "Digite sua opção: ");
		
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao != 9) {
 
			opcao = menu(sc);
			
			switch (opcao) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;

			default:
				
			}
		}

	}

}
