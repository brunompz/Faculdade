import com.meupacote.Carro;

public class Teste {

    public static void main(String[] args){
        Carro carro = new Carro("Chronos", 2022, "vermelho", 4);

        //Atrivuto acessivel porque é publico
        System.out.println("Modelo de carro: "+carro.modelo);
        //Para ter acesso ao ano, preciso utilizar o metodo getAno()
        System.out.println("Ano do carro: "+ carro.getAno());
        carro.setAno(2023);
        System.out.println("Novo valor do Ano do carro: "+carro.getAno());

        carro.ligar();
    }
}
