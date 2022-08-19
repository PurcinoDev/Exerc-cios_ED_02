package controller;

public class BinarioController {
	
	public BinarioController() {
		super();
	}
	
	public String calculaBinario(int n) {
		if (n <= 0) {
			return "0";
		} else {
			n = n / 2;
			int binResult = n % 2;
			String binResultString = String.valueOf(binResult);
			return calculaBinario(n) + binResultString;
		}
	}
}
