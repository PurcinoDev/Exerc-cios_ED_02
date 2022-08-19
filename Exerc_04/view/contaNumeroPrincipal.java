package view;

import javax.swing.*;
import controller.contaNumeroControler;
/**
 *
 * @author arthur.purcino
 */
public class contaNumeroPrincipal {
    
    public static void main(String[] args) {
        contaNumeroControler contNum = new contaNumeroControler();
    
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número menor que 999999 e maior que 10"));
        int numeroRecebido = n1;
        if (n1 > 10 && n1 < 1000000) {
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um outro número para comparar"));
            if (n2 >= 0 && n2 < 10) {
                int resultado = contNum.contaNumero(n1, n2);
                JOptionPane.showMessageDialog(null, "O número de vezes em que " + n2 + " aparece em " + numeroRecebido + " é de : " + resultado);
            } else {
                JOptionPane.showMessageDialog(null, "Por gentileza, inserir apenas um algarismo, e não um numero inteiro ou maior que 10");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insira um número maior que 9 ou menor que 1000000");
        }
        
    }
    
}
