package com.meupacote;
public class Carro {
    //Modificador public: aceesível em qualquer lugar
    public String modelo;

    //Modificador private: acessivel apenas dentro da classe Carro
    private int ano;

    //Modificador protected: acessivel dentro da classe, sublasses e pacotes
    protected String cor;

    //Modificador default: Acessivel apenas dentro do pacote
    int numeroDePortas;

    //Construtor publico
    public Carro(String modelo, int ano, String cor, int numeroDePortas){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numeroDePortas = numeroDePortas;
    }

    //Metodo publico
    public void ligar(){
        System.out.println("O carro está ligado");
    }

    //Metodo privado: Só pode ser chamado dentro da propria classe
    private void acelerar(){
        System.out.println("O carro está acelerando");
    }

    //Metodos getters e setters(para o atributo privado ano)
    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    //Metodo protegido
    protected void pintarCarro(String novaCor){
        this.cor = novaCor;
        System.out.println("O carro foi pintado de " + novaCor);
    }

    //Metodo default
    void mostrarNumeroDePortas(){
        System.out.println("O carro tem "+ numeroDePortas + " portas.");
    }
}
