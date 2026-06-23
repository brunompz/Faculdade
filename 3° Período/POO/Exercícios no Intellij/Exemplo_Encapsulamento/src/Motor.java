public class Motor{
    private boolean ligado;
    private int rpm;


    public Motor(){
        this.ligado = false;
        this.rpm = 0;
    }

    public void ligar(){
        if(this.ligado == false){
            this.ligado = true;
            this.rpm = 1000;
        }
    }

    public void desligar(){
        if(this.ligado){
            this.ligado = false;
        }
        this.rpm = 0;
    }

    public void acelerar(int nivel){
        if (isLigado()) {
            rpm += (nivel * 1000);
            if (rpm >= 8000) {
                rpm = 8000;
            } else if (rpm <= 0) {
                desligar();
            }
        }
    }

    public boolean isLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public int rotacaoPorMinuto(int rpm, int nivelAceleracao){
        contadorRpm = rpm + (nivelAceleracao * 1000);
        return contadorRpm;
    }

    public int getRpm(){
        return rpm;
    }
}