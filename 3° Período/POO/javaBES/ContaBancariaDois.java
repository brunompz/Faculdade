public class ContaBancariaDois{
	private double saldo;
	
	public ContaBancariaDois(){
		saldo = 0.0;
	}
	
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	public void sacar(double valor){
		saldo = saldo - valor;
	}
	
	public void mostrarSaldo(){
		System.out.println("Saldo atual: " + saldo);
	}
	
	public static void main(String[] args){
		ContaBancariaDois c1 = new ContaBancariaDois();
		ContaBancariaDois c2 = new ContaBancariaDois();
		c1.mostrarSaldo();
		c1.depositar(500.0);
		c1.mostrarSaldo();
		c1.sacar(25.0);
		c1.mostrarSaldo();
	}
}