/**
 * Compute Fibancci numbers. 
 */
public class Fibonacci {
    long fibRec(int n) {
        if (n > 1) {
            return fibRec(n - 1) + fibRec(n - 2);
        } else {
            return 1;   // = fib(0) = fib(1)
        }
    }
    

    static public void main(String[] args) {
        Fibonacci f = new Fibonacci();
        
        System.out.println(f.fibRec(5));
    }
}