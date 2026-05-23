import java.util.Scanner;
public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do titular da conta:");
		String nome = sc.nextLine();
		System.out.println("O saldo inicial da conta é de R$0,00");
		System.out.println("Deposite um valor ");
		double valor = sc.nextDouble();
		System.out.println("Informações da conta");


		
	ContaBancaria conta1 = new ContaBancaria(nome, 0.0, 1);

	conta1.depositar(valor);
	 System.out.println(conta1.getNome());
	 System.out.println("R$" + conta1.getSaldo());
	 System.out.println("ID da conta: " + conta1.getID());
	 String resposta;

	 do {
		 System.out.println("Deseja sacar um valor? (s/n)");
		 resposta = sc.next();

		 if (resposta.equalsIgnoreCase("s")) {
			 System.out.println("Digite o valor a ser sacado:");
			 int saque = sc.nextInt();
			 conta1.sacar(saque);
			 System.out.println("saldo atual: R$" + conta1.getSaldo());
		 } else if (resposta.equalsIgnoreCase("n")) {
			 System.out.println("Operação finalizada.");
		 }
	 } while (!resposta.equalsIgnoreCase("n"));
	 System.out.println("Obrigado por usar nosso sistema bancário!");
	 sc.close();	
	 }

	}

