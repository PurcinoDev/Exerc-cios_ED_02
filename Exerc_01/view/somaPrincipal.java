package view;

import javax.swing.*;

import controller.somaControllewr;

public class somaPrincipal {
	
	public static void main(String[] args) {
		somaControllewr somaCont = new somaControllewr();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira aqui um número. Iremos somar os primeiros números naturais"));
		
		int resultadoTermial = somaCont.Termial(n);
		JOptionPane.showMessageDialog(null, "O resultado da somatória de " + n + " com os primeiros numeros naturais ate ele é de " + resultadoTermial);
	}
	
}