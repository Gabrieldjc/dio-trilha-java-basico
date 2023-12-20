import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        Double Saldo = scanner.nextDouble();
        
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é "+ Agencia + ", conta " + Numero + ", e seu saldo " + Saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
