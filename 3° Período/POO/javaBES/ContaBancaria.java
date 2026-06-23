public class ContaBancaria{
	double saldo;
	double saque;
	double deposito;
	
	public ContaBancaria(double s, double d){
		saque = s;
		deposito = d;
		saldo = 500.0;
	}
	
	public void depositar(){
		saldo = saldo + deposito;
	}
	
	public void sacar(){
		saldo = saldo - saque;
	}
	
	public void mostrarSaldo(){
		System.out.println("Saldo atual: " + saldo);
	}
	
	public static void main(String[] args){
		ContaBancaria b1 = new ContaBancaria(50, 100);
		b1.mostrarSaldo();
		b1.sacar();
		b1.mostrarSaldo();
		b1.depositar();
		b1.mostrarSaldo();
		
	}
}