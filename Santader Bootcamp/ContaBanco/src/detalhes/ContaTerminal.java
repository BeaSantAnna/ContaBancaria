package detalhes;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);;

		System.out.println("Por favor, digite o número da conta: ");
		int numero = entrada.nextInt();
		
		System.out.println("Por favor, digite o número da agência: ");
		String agencia = entrada.next();
		
		System.out.println("Por favor, digite primeiro nome do cliente: ");
		String nomeCliente = entrada.next();
		
		
		System.out.println("Por favor, adicione o saldo: ");
		double saldo = entrada.nextDouble();
		
		System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta no nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo R$" +saldo+ " já está disponível para saque! ");
	
		entrada.close();
	}

}
