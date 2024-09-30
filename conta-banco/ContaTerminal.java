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

        String mensagem = "Olá ".concat(nome)
            .concat(", agradecemos por criar uma conta em nosso banco! A sua agência é ")
            .concat(agencia)
            .concat(" e a sua conta ")
            .concat(String.valueOf(numero))
            .concat(". O saldo de R$ ")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        sc.close();       
    }
}