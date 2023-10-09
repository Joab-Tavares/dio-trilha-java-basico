import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int agencia;
        String conta, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = sc.nextInt();

        System.out.println("Por favor, digite o número da Conta: ");
        conta = sc.next();

        System.out.println("Por favor, digite o número da Nome: ");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o número da Saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque");
    }
}
