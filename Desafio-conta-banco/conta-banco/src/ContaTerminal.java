import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); //Iniciando o scanner

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt(); // Consumir o que foi digitado
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine(); 

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        //Mensagem que irá aparecer na tela
        System.out.println("Olá " + nomeCliente + "! Agradecemos por criar uma conta! Sua agência é " + agencia + ", sua conta é " + numero + " e seu saldo é de R$" + saldo + ", você já pode realizar um saque!");

        scanner.close(); //Fechamendo do scanner
    }
}
