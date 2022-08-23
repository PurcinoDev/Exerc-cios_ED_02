package view;
/**
 *
 * @author arthur.purcino
 */

import javax.swing.*;
import controller.SerieFatorialController;

public class SerieFatorialPrincipal {

    public static void main(String[] args) {
        
        SerieFatorialController serieFatCont = new SerieFatorialController();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para calcularmos uma série"));
        
        if (n < 0 || n > 20) {
            JOptionPane.showMessageDialog(null, "Este número não é válido para esta aplicação");
        } else {
            double result = serieFatCont.calculaSerie(n);
            JOptionPane.showMessageDialog(null, "O resultado do cálculo da sua série é " + result);
        }
        
    }
}
