public class Teste {
    public static void main(String[] args){
        Motor motor = new Motor();
        System.out.println("Status do motor: " + motor.isLigado());
        System.out.println("Chamando método para ligar motor ");
        motor.ligar();
        motor.rotacaoPorMinuto(50,100);
        System.out.println("Status do motor: " + motor.isLigado());
        System.out.println("RPM: " + motor.rotacaoPorMinuto(50, 100));
        System.out.println("Chamando método para desligar motor");
        motor.desligar();
        System.out.println("Status do motor: " + motor.isLigado());
    }
}
