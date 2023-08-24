import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem-vindo(a) ao jogo de Adivinhe o Número!!");

        int numeroAleatorio = new Random().nextInt(5); 
        int numeroDigitado = 0;
        int numeroChances = 0;

        for (int i = 5; i > numeroChances; i++) {
            System.out.println("Digite um número de 0 á 5:");
            int digitou = leitura.nextInt();
            numeroDigitado = digitou;
            numeroChances ++;

            if (numeroChances == 5) {
                System.out.println("Você perdeu!!");
                break;
            }
            if (numeroAleatorio == numeroDigitado) {
                System.out.println("Você Acertou!!");
                break;
            }
        }
    }
}
