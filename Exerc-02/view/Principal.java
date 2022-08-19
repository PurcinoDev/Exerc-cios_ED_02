package view;

import javax.swing.JOptionPane;

import controller.BinarioController;

public class Principal {

	public static void main(String[] args) {
		BinarioController binCont = new BinarioController();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para que transformemos ele em binário"));
		
		if (n < 2000) {
			String binario = binCont.calculaBinario(n);

			System.out.println(binario);			
		} else {
			System.out.println("Não use numeros maiores que 2000");
		}

	}
}
