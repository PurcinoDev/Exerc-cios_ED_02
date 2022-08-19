package controller;
/**
 *
 * @author arthur.purcino
 */
public class contaNumeroControler {
    
    public contaNumeroControler() {
        super();
    }
    
    public int contaNumero(int n1, int n2) {
        // Condição de Parada
        if (n1 == 0){
            return 0;
        } else {
            int resto = n1 % 10;
            n1 = n1 / 10;
            if (resto == n2){
                // Condição 1 de termo anterior: Caso seja igual
                return 1 + contaNumero(n1, n2);
            } else {
                // Condição 2 de termo anterior: Caso seja diferente
                return contaNumero(n1, n2);
            }
        }
    }
}