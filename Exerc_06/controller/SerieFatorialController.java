package controller;
/**
 *
 * @author arthur.purcino
 */
public class SerieFatorialController {
    
    public SerieFatorialController() {
        super();
    }
    
    public int geraFatorial(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * geraFatorial(n - 1);
        }
    }
    
    public double calculaSerie(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fat = geraFatorial(n);
            double resultado = 1 / (double) fat;
            return resultado + calculaSerie(n - 1);
        }
    }
}
