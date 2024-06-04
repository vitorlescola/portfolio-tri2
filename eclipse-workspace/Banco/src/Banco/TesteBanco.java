package Banco;

public class TesteBanco {
	public static void main(String[] args) {
		ContaPoupança contaFulano=new ContaPoupança();
		
		System.out.println(contaFulano.calcularRendimento(100));
	}
}
/*public static void main(String[] args) {
ContaBancaria contaFulano=new ContaBancaria();
ContaBancaria contaFulana=new ContaBancaria();

contaFulano.depositar(1000000);
contaFulano.sacar(100);
contaFulana.depositar(0.01);
contaFulana.sacar(5000);

System.out.println("Saldo Fulano: " +contaFulano.retornarSaldo());
System.out.println("Saldo Fulana: " +contaFulana.retornarSaldo());
}*/

/*public static void main(String[] args) {
ContaCorrente contaFulano=new ContaCorrente();
ContaCorrente contaFulana=new ContaCorrente();

double limiteFulano=contaFulano.calcularLimite(false, false, false);
double limiteFulana=contaFulana.calcularLimite(false, false, true);


System.out.println("O limite da conta de Fulano é: R$"+limiteFulano);
System.out.println("O limite da conta de Fulana é: R$"+limiteFulana);

contaFulano.depositar(100);

contaFulano.sacar(200);

System.out.println("\nValor na conta de Fulano: R$"+contaFulano.retornarSaldo());
System.out.println("Valor na conta de Fulana: R$"+contaFulana.retornarSaldo());

}*/