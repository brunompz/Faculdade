public class Exemplo4{
	String msg;
	public Exemplo4(){
		msg = "";
	}

public static void main(String[] args){
	Exemplo4 e1 = new Exemplo4();
	Exemplo4 e2;
	e2 = e1;
	System.out.println("Comparando os objetos: ");
	System.out.println(e1==e2);
	System.out.println("Comparando os objetos agora utilizando equals: ");
	System.out.println(e1.equals(e2));
	}
}