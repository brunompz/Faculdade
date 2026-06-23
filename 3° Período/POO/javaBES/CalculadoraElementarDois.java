public class CalculadoraElementarDois{
	private double valor1;
	private double valor2;
	private double resultado;
	
	private void setarValorUmAposOperacao(){
		valor1 = resultado;
	}
	
	public CalculadoraElementarDois(double v1, double v2){
		valor1 = v1;
		valor2 = v2;
		resultado = 0.0;
	}
	
	public void somar(){
		resultado = valor1 + valor2;
		setarValorUmAposOperacao();
	}
	
	public void subtrair(){
		resultado = valor1 - valor2;
		setarValorUmAposOperacao();

	}
	
	public void mostrar(){
		System.out.println("resultado: " + resultado);		
	}
	
	public static void main(String[] args){
		CalculadoraElementarDois b1;
		CalculadoraElementarDois c1 = new CalculadoraElementarDois(10.0, 15.0);
		c1.somar();
		c1.mostrar();
		c1.subtrair();
		c1.mostrar();
		c1.subtrair();
		c1.mostrar();
		c1.subtrair();
		c1.mostrar();
		
		b1 = new CalculadoraElementarDois(10.0, 35.0);
		b1.subtrair();
		b1.mostrar();
	}
}