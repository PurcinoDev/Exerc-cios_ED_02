package view;
/**
 *
 * @author arthur.purcino
 */
import controller.FibonacciController;
import javax.swing.*;

public class FibonacciPrincipal {
    public static void main(String[] args) {
        
        FibonacciController fiboCont = new FibonacciController();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número. Ele representará uma posição da série, retornando seu valor."));
        
        if (n < 0 || n > 20) {
            JOptionPane.showMessageDialog(null, "Este número não é válido para esta aplicação");
        } else {
            int resultado = fiboCont.geraFibonacci(n);
            JOptionPane.showMessageDialog(null, "O número que você digitou corresponde ao número " + resultado);
        }
    }
}