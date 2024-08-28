import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Insira o número da Agência");
        String agencia = scanner.next();

        System.out.println("Insira o número da conta");
        int conta = scanner.nextInt();

        System.out.println("Insira o saldo inicial");
        double saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        String mensagem = "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo
                + " já está disponível para saque.";
        System.out.println(mensagem);

    }
}
