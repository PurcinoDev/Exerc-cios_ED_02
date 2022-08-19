package controller;

import javax.swing.JOptionPane;

public class somaControllewr {
	
	public somaControllewr() {
		super();
	}
	
	public int Termial(int n) {
		if (n <= 0) {
			return 0;
		} else {
			int somatoria = n;
			n -= 1;
			return somatoria + Termial(n);
		}
	}
}
