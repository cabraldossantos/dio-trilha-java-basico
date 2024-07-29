import java.util.Scanner;

public class AplicativoBanco {

    public static void main(String[] args) {

        ContaTerminal conta;
        conta = new ContaTerminal();

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência! ");
        conta.setAgencia(sc.nextLine());

        System.out.print("Por favor, digite o número da Conta! ");
        conta.setNumero(sc.nextInt());

        System.out.print("Por favor, digite o seu saldo! ");
        conta.setSaldo(sc.nextBigDecimal());

        System.out.print("Por favor, digite o seu nome! ");
        sc.nextLine();
        conta.setTitular(sc.nextLine());

        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, " +
                        "conta %d e seu saldo de R$ %.2f já está disponível para saque!",
                conta.getTitular(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());

        sc.close();

    }

}
