package Banco;

public class ContaBancaria {
	private double saldo=0;  //se não especificar "private" sempre sera public
	
	/*
	  Deposita dinheiro na conta bancaria
	  @param valor valor a depositar
	 */
	public void depositar(double valor){
		this.saldo+=valor;
	}
	
	/*
	 Retira dinheiro da conta bancaria
	 @param valor valor a retirar
	  */
	public void sacar(double valor) {
		if (saldo>=valor) {  //if normal
		this.saldo-=valor;
		}else{
			System.out.println("Não pode sacar um valor maior que o presente na conta, valor presente: "+saldo);
		}
		//if ternario
		/*
		 
		 */
	}
	
	/*
	 Obtem o saldo final da conta bancaria 
	 @return saldo atual
	 */
	public double retornarSaldo() {
		return this.saldo;
	}
}