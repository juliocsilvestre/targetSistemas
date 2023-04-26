package questions;

public class Question01 {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Ao final do processamento o valor da variavel soma sera: " + SOMA);
    }
}
