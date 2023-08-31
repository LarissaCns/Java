import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Larissa Cristina";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("*******************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("\n*****************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);
        int digitou = 0;
        
        while (digitou < 4) {
            System.out.println(menu);
            digitou = leitura.nextInt();
            switch (digitou) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double valor = leitura.nextInt();
                    if (saldo < valor) {
                        System.out.println("Você não possui saldo suficiente");
                        break;
                    }
                    double novoSaldo = saldo - valor;
                    saldo = novoSaldo;
                    System.out.println("Saldo atualizado R$:" + novoSaldo);
                    break;
                case 3: 
                    System.out.println("Informe o valor a receber: ");
                    double valor2 = leitura.nextInt();
                    double novoSaldo2 = saldo + valor2;
                    saldo = novoSaldo2;
                    System.out.println("Saldo atualizado R$:" + novoSaldo2);
                    break;
            }
            if(digitou == 4) {
            break;
        }
        }
    }
}

