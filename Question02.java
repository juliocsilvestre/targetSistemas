package questions;
import java.util.Scanner;



public class Question02 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        int fibonacciAnterior = 0;
        int fibonacciAtual = 1;
        int fibonacciProximo = 1;
        
        while (fibonacciProximo < numero) {
            fibonacciProximo = fibonacciAnterior + fibonacciAtual;
            fibonacciAnterior = fibonacciAtual;
            fibonacciAtual = fibonacciProximo;
        }
        
        if (fibonacciProximo == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        sc.close();
    }
}

