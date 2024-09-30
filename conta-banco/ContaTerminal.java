import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();
        
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", agradecemos por criar uma conta em nosso banco! A sua agência é " + agencia + " e a sua conta " + numero + ". O saldo de R$ " + saldo + " está disponível para saque.");
    }
}