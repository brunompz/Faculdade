public class CalculadoraElementar{
		int valorUm = 20;
		int valorDois = 30;
	public static void main(String[] args){
		CalculadoraElementar soma = new CalculadoraElementar();
		soma.somar();
		CalculadoraElementar subtracao = new CalculadoraElementar();
		subtracao.subtrair();
	}
	public int somar(){
		int operacaoSoma = this.valorUm + this.valorDois;
		System.out.println(this.valorUm + " + " + this.valorDois + " = " + operacaoSoma);
		return operacaoSoma;
	}
	public int subtrair(){
		int operacaoSubtracao = this.valorUm - this.valorDois;
		System.out.println(this.valorUm + " - " + this.valorDois + " = " + operacaoSubtracao);
		return operacaoSubtracao;
	}
}