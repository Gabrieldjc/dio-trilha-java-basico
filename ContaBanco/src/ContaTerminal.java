import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu Saldo: ");
        Double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é "+ agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
