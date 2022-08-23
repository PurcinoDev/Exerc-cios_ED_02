package controller;
/**
 *
 * @author arthur.purcino
 */
public class FibonacciController {
    
    public FibonacciController() {
        super();
    }
    
    public int geraFibonacci(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        } else {
            return geraFibonacci(n - 1) + geraFibonacci(n - 2);
        }
    }
}