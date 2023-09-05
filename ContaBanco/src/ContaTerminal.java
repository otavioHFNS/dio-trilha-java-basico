import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner

        //Obter pela classe scanner os valores digitados no terminal
        
        //Exibir as mensagens para o nosso usuário
        
        //Exibir a mensagem conta criada
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite o numero da agencia");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta");
        int numero = scanner.nextInt();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso Banco, sua Agência é " + agencia + ", Conta " + numero + ", e o seu Saldo de R$ " + saldo + " já está disponível para Saque");
        
       
    }
}
