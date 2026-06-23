public class Computador implements Dispositivo{
    @Override
    public void ligar() {
        System.out.println("PC ligado");
    }

    @Override
    public void desligar() {
        System.out.println("PC desligado");
    }
}
