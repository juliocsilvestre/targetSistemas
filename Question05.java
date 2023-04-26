package questions;
import java.util.Scanner;


public class Question05 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String string = sc.nextLine();
        

        char[] caracteres = string.toCharArray();
        

        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }
        
        String stringInvertida = new String(caracteres);
        
        System.out.println("string invertida: " + stringInvertida);
        

        sc.close();
    }
}
