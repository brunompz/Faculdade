import java.util.ArrayList;

public class Pedido {
    private ArrayList<Pedido> pedido = new ArrayList<>();
    private int qnt;

    public Pedido(int qnt){
        pedido = new ArrayList<>();
        this.qnt = qnt;
    }

    public void setEmailCliente(String emailCliente){
        this.emailCliente = emailCliente;
    }

    public String getEmailCliente(){
        return emailCliente;
    }


}
