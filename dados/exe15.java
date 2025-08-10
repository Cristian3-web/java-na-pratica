
import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
            System.out.println("Você digitou: " + numero);
        }
    }
}