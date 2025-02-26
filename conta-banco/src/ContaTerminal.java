import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        //scanner.next() usado para string
        System.out.println("Digite a sua Agência: ");
        String agenciaBancaria = scanner.next();

        System.out.println("Digite sua conta bancária: ");
        int contaBancaria = scanner.nextInt();

        System.out.println("Digite seu saldo disponivél para saque:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma cona em nosso banco,sua agência é " + agenciaBancaria + " , conta "+ contaBancaria + " e seu saldo " + saldo + " já está disponivél para saque");
        
        scanner.close();
    }
}
